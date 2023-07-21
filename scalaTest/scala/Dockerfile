FROM ubuntu:20.04

ARG JAVA_VERSION="11.0.20-zulu"

RUN apt-get update && \
    apt-get install -y unzip zip curl vim && \
    curl -s "https://get.sdkman.io" | bash
RUN bash -c "source $HOME/.sdkman/bin/sdkman-init.sh && \
    sdk install java $JAVA_VERSION && \
    sdk install scala"
# ここから下はbash日本語化用
RUN apt-get install -y language-pack-ja-base language-pack-ja && \
    locale-gen ja_JP.UTF-8
RUN echo export LANG=ja_JP.UTF-8 >> ~/.profile
RUN bash -c "source ~/.profile"