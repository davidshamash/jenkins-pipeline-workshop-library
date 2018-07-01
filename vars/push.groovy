void push() {
  script.docker.withServer('https://registry.hub.docker.com', 'dockerHub') {
      script.docker.image('${env.IMAGE}').push()
  }
}
