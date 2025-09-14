#!/usr/bin/env bash
set -euo pipefail

USERNAME="github-actions[bot]"
EMAIL="41898282+github-actions[bot]@users.noreply.github.com"
TAG_NAME=$1
LIB_VERSION="0.1"

# commit
git config --local user.name "${USERNAME}"
git config --local user.email "${EMAIL}"
git add .
git commit -m "Update Twemoji to ${TAG_NAME}"

TAG=$(echo "${LIB_VERSION}-${TAG_NAME}" | sed -e 's/v//g')

# push
if [ $? -eq 0 ]; then
    echo "Commit created. Proceeding to push and tag..."
    git tag "$TAG"
    git push "https://x-access-token:${GITHUB_TOKEN}@github.com/${GITHUB_REPOSITORY}.git" HEAD:main --tags
else
    echo "No changes to commit. Skipping push."
fi
