#!/bin/bash
# HOW TO USE:
# ./run.sh amera.FarthestPair algs4-data/1Mints.txt

CLASSPATH="$(pwd)/target/classes"

mvn compile
java -classpath $CLASSPATH "$@"
