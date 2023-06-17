ThisBuild / scalaVersion := "$scalaVersion$"
ThisBuild / version := "$version$"
ThisBuild / libraryDependencies ++= commonDependencies
Test      / testOptions += Tests.Argument(TestFrameworks.ScalaTest, "-P4")

val commonDependencies = Seq(
  "org.apache.spark"    %% "spark-core"       % "$sparkVersion$"  % "provided",
  "org.apache.spark"    %% "spark-sql"        % "$sparkVersion$"  % "provided",
  "org.apache.spark"    %% "spark-hive"       % "$sparkVersion$"  % "provided",
  "org.apache.spark"    %% "spark-graphx"     % "$sparkVersion$",
  "com.chuusai"         %% "shapeless"        % "2.3.10",
  "com.github.scopt"    %% "scopt"            % "4.1.0",
  "org.scalatest"       %% "scalatest"        % "3.2.15" % Test,
  "com.github.mrpowers" %% "spark-fast-tests" % "1.3.0"  % Test
)

lazy val root = (project in file("."))
  .settings(
    name := "root"
  )
  .aggregate(ch01, ch02, ch03, ch04, ch05, ch06, ch07, ch08, ch09, ch10)

lazy val ch01 = project
lazy val ch02 = project
lazy val ch03 = project  
lazy val ch04 = project  
lazy val ch05 = project  
lazy val ch06 = project  
lazy val ch07 = project  
lazy val ch08 = project  
lazy val ch09 = project  
lazy val ch10 = project  


assembly / assemblyJarName := "$name;format="lower"$-fatjar-$version$.jar"

assembly / assemblyMergeStrategy := {
  case PathList("META-INF", xs @ _*) => MergeStrategy.discard
  case x                             => MergeStrategy.first
}

