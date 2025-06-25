#!/bin/sh
export JAVA_HOME="$HOME/.sdkman/candidates/java/current"
./gradle/wrapper/gradle-wrapper.jar "$@"
