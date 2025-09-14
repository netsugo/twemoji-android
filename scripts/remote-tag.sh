#!/usr/bin/env bash
set -euo pipefail

REPO_URL=https://github.com/jdecked/twemoji
curl -s -L -o /dev/null -w "%{url_effective}\n" "${REPO_URL}/releases/latest" | grep tag | xargs basename
