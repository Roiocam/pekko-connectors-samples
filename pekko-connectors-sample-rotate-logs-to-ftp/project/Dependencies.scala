import sbt._

object Dependencies {
  val scalaVer = "2.13.12"
  // #deps
  val PekkoVersion = "1.0.2"
  val PekkoConnectorsVersion = "1.0.1"

  // #deps

  val dependencies = List(
    // #deps
    "org.apache.pekko" %% "pekko-stream" % PekkoVersion,
    "org.apache.pekko" %% "pekko-actor-typed" % PekkoVersion,
    "org.apache.pekko" %% "pekko-actor" % PekkoVersion,
    "org.apache.pekko" %% "pekko-connectors-file" % PekkoConnectorsVersion,
    "org.apache.pekko" %% "pekko-connectors-ftp" % PekkoConnectorsVersion,
    // #deps
    // Playground file system and FTP server
    // https://mina.apache.org/ftpserver-project/downloads.html
    "org.apache.ftpserver" % "ftpserver-core" % "1.1.1", // ApacheV2
    "org.apache.sshd" % "sshd-scp" % "2.5.1", // ApacheV2
    "org.apache.sshd" % "sshd-sftp" % "2.5.1", // ApacheV2
    "com.google.jimfs" % "jimfs" % "1.1", // ApacheV2
    // Logging
    "org.apache.pekko" %% "pekko-slf4j" % PekkoVersion,
    "ch.qos.logback" % "logback-classic" % "1.2.13")
}
