#!/bin/bash

set -ue -o pipefail

BASE_DIR=$(cd $(dirname $0); pwd)
cd ${BASE_DIR}

rm -rf ${BASE_DIR}/target ${BASE_DIR}/WEB-INF/classes
