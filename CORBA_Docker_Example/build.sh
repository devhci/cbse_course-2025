#!/bin/bash
docker build -t corba-example .
docker run --rm -p 1050:1050 corba-example
