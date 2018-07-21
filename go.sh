#!/usr/bin/env bash

docker run --rm -v $(pwd):/opt/app -w /opt/app gradle gradle upload
