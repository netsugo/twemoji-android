#!/usr/bin/env bash
set -euo pipefail

ROOT="$(dirname "$0")/.."
cd "${ROOT}"

# setup vd-tool
TOOL_SOURCE_FILE="vd-tool.zip"
curl -L -o "./${TOOL_SOURCE_FILE}" "https://github.com/rharter/vd-tool/releases/latest/download/${TOOL_SOURCE_FILE}"
unzip "./${TOOL_SOURCE_FILE}"
rm "./${TOOL_SOURCE_FILE}"
