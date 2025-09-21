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
TARGET_DIR="./twemoji/src/main/res/drawable"
mkdir -p "${TARGET_DIR}"
for f in "${OUTPUT_DIR}"/*; do mv "$f" "${TARGET_DIR}/${PREFIX}$(basename "$f" | sed -e 's/-/_/g')"; done

# convert svg -> Compose ImageVector
OUTPUT_COMPOSE_DIR="./twemoji/src/main/kotlin/com/github/netsugo/twemoji"
S2C_BINARY="s2c-linuxX64-binaries/s2c.kexe"
chmod +x ./gradlew
chmod +x "${S2C_BINARY}"
"${S2C_BINARY}" \
    --output "${OUTPUT_COMPOSE_DIR}" \
    --package "com.github.netsugo.twemoji" \
    --theme "" \
    --optimize=false \
    --no-preview \
    "${TARGET_DIR}"
