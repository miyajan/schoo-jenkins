#!/bin/bash

set -ue -o pipefail

BASE_DIR=$(cd $(dirname $0); pwd)
cd ${BASE_DIR}

mkdir -p ${BASE_DIR}/target/classes
javac -cp "${BASE_DIR}/lib/*" -d ${BASE_DIR}/target/classes $(find src/{main,test}/java/schoo/jenkins -name "*.java")
