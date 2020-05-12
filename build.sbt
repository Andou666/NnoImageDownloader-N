name := "imagedownloader"

version := "0.1"

scalaVersion := "2.13.2"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.5.31",
  "com.typesafe.akka" %% "akka-testkit" % "2.5.31" % Test,
  "com.squareup.okhttp3" % "okhttp" % "3.11.0",
  "com.typesafe" % "config" % "1.3.3"
)