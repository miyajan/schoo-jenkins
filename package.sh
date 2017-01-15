#!/bin/bash

set -ue -o pipefail

BASE_DIR=$(cd $(dirname $0); pwd)
cd ${BASE_DIR}

rm -rf ${BASE_DIR}/WEB-INF/classes ${BASE_DIR}/target/schoo-jenkins.war

mkdir -p ${BASE_DIR}/WEB-INF/classes
cp -R ${BASE_DIR}/target/classes/* ${BASE_DIR}/WEB-INF/classes/
jar -cf ${BASE_DIR}/target/schoo-jenkins.war *
