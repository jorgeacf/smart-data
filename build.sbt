name := "src"

version := "0.1"

scalaVersion := "2.11.8"

fork := true

libraryDependencies ++= Seq(
  "org.apache.spark" % "spark-core_2.11" % "2.2.0",// % "provided"
  "org.scalatest" % "scalatest_2.11" % "3.0.4" % "test",
  "junit" % "junit" % "4.12" % "test"
)