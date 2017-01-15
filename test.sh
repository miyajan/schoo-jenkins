#!/bin/bash

set -ue -o pipefail

BASE_DIR=$(cd $(dirname $0); pwd)
cd ${BASE_DIR}

java -cp "${BASE_DIR}/lib/*:${BASE_DIR}/target/classes" -Dorg.schmant.task.junit4.target=target/junit_report.xml schoo.jenkins.runner.TestRunner schoo.jenkins.FizzBuzzTest
