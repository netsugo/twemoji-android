#!/usr/bin/env bash
set -euo pipefail

ROOT="$(dirname "$0")/.."
cd "${ROOT}"

# convert svg -> vector drawable (requires java)
SOURCE_DIR="./tmp/twemoji/assets/svg"
OUTPUT_DIR="./tmp/xml"
mkdir -p "${OUTPUT_DIR}"
bash "./vd-tool/bin/vd-tool" -c -in "${SOURCE_DIR}" -out ${OUTPUT_DIR}

# rename files
PREFIX="emoji_"
TARGET_DIR="./twemoji/src/res/drawable"
mkdir -p "${TARGET_DIR}"
for f in "${OUTPUT_DIR}"/*; do mv "$f" "${TARGET_DIR}/${PREFIX}$(basename "$f")"; done
