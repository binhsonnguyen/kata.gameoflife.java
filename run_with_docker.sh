#!/bin/bash

set -e

docker run -v $(pwd):/app -it gradle:jdk /bin/bash
