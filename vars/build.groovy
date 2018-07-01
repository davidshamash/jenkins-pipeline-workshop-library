void build() {
  script.docker.build("{env.IMAGE}")
  script.docker.build("${env.IMAGE_LATEST}")
  }
}
