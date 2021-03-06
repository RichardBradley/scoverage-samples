name := "scoverage-samples"

organization := "com.sksamuel.scoverage"

version := "0.95.8"

scalaVersion := "2.10.3"

javacOptions ++= Seq("-source", "1.6", "-target", "1.6")

libraryDependencies ++= Seq(
  "commons-io" % "commons-io" % "2.4",
  "com.typesafe.akka" %% "akka-actor" % "2.2.3",
  "com.typesafe.akka" %% "akka-actor-tests" % "2.2.3",
  "org.scalatest" %% "scalatest" % "2.0" % "test",
  "org.scala-lang" % "scala-compiler" % "2.10.3" % "provided",
  "org.scala-lang" % "scala-reflect" % "2.10.3"
)

ScoverageSbtPlugin.instrumentSettings

CoverallsPlugin.singleProject

publishArtifact in Test := false

parallelExecution in Test := false
