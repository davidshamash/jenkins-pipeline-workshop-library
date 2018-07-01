void prep() {
  def gitCommitHash = script.sh(returnStdout: true, script: 'git rev-parse HEAD').trim()
  def shortCommitHash = gitCommitHash.take(7)
  env.VERSION = shortCommitHash
  currentBuild.displayName = "#${BUILD_ID}-${VERSION}"
  env.IMAGE = "$PROJECT:$VERSION"
  env.IMAGE_LATEST = "$PROJECT:latest"
}
