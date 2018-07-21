#!/usr/bin/env bash

docker -v
docker images
docker run --rm -v $(pwd):/opt/app -w /opt/app gradle gradle upload
