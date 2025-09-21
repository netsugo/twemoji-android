#!/usr/bin/env bash
set -euo pipefail

ROOT="$(dirname "$0")/.."
cd "${ROOT}"

curl -L -o s2c.zip https://github.com/rafaeltonholo/svg-to-compose/releases/latest/download/s2c-linuxX64-binaries.zip
unzip s2c.zip
rm s2c.zip
