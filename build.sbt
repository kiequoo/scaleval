name := "scaleval"

version := "1.0-SNAPSHOT"

scalaVersion := "2.11.4"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  "com.twitter" %% "util-eval" % "6.12.1"
)

play.Project.playScalaSettings
