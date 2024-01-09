FROM ubuntu:latest
LABEL authors="Scott"

ENTRYPOINT ["top", "-b"]