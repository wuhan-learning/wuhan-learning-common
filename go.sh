#!/usr/bin/env bash

whoami
docker -v
sudo docker images
sudo docker run --rm -v $(pwd):/opt/app -w /opt/app gradle gradle upload
