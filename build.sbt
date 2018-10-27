import com.typesafe.sbt.less.Import.LessKeys
import play.PlayScala

name := """play-sb-admin-2"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  ws,
  "org.webjars" % "bootstrap" % "3.3.2",
  "org.webjars" % "metisMenu" % "1.1.3",
  "org.webjars" % "morrisjs" % "0.5.1",
  "org.webjars" % "font-awesome" % "4.3.0",
  "org.webjars" % "jquery" % "2.1.3",
  "org.webjars" % "flot" % "0.8.3",
  "org.webjars" % "datatables" % "1.10.5",
  "org.webjars" % "datatables-plugins" % "1.10.5",
  "com.newrelic.agent.java" % "newrelic-agent" % "3.14.0",
  "com.newrelic.agent.java" % "newrelic-api" % "3.14.0",
  "org.apache.spark" %% "spark-core" % "2.1.0",
  "org.apache.spark" %% "spark-sql" % "2.1.0",
  "org.apache.spark" %%"spark-streaming" % "2.1.0",
  "org.apache.spark" %% "spark-mllib" % "2.1.0",
  "com.typesafe.akka" %% "akka-actor" % "2.5.6",
  "com.typesafe.akka" %% "akka-slf4j" % "2.5.6",
  "com.fasterxml.jackson.core" % "jackson-databind" % "2.6.5",
  "org.vegas-viz" %% "vegas" % "0.3.11",
  "org.vegas-viz" %% "vegas-spark" % "0.3.11",
  "org.apache.hadoop" % "hadoop-common" % "2.7.6",
  "org.apache.hadoop" % "hadoop-client" % "2.7.6",
  "org.apache.hadoop" % "hadoop-hdfs" % "2.7.6",
  "com.knockdata" % "spark-highcharts" % "0.6.4", 
  "junit" % "junit" % "4.8" % Test,
"com.crealytics" %% "spark-excel" % "0.9.0"
)



includeFilter in (Assets, LessKeys.less) := "sb-admin-2.less" | "tables.less"

libraryDependencies += filters