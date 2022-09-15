#!/usr/bin/bash

clear
sourceFile=$1
classFile="${sourceFile%.*}"
javac $sourceFile && java $classFile