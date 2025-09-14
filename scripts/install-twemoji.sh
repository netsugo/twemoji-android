#!/usr/bin/env bash
set -euo pipefail

ROOT="$(dirname "$0")/.."
cd "${ROOT}"

# setup svg sources
SOURCE_URL="https://github.com/jdecked/twemoji.git"
mkdir -p ./tmp
cd ./tmp || exit
git clone --depth 1 "${SOURCE_URL}"
