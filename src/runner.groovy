abstract class baseRunALl implements Serializable {

void runAll() {
  runStage( name: 'Build preparations', this.&prep)
  runStage( name: 'Build Docker Image', this.&build)
  runStage( name: 'Push Docker Image', this.&push)
}

void run() {
  runAll()
}
