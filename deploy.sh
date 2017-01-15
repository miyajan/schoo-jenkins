#!/bin/bash

set -ue -o pipefail

BASE_DIR=$(cd $(dirname $0); pwd)
cd ${BASE_DIR}

cp target/schoo-jenkins.war /usr/local/tomcat/webapps/
