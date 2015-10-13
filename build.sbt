name := "scala-storm"

scalaVersion := "2.11.7"

crossScalaVersions := Seq("2.10.6", "2.11.7")

organization := "com.github.velvia"

libraryDependencies += "org.apache.storm" % "storm-core" % "0.9.5" % "provided" exclude("junit", "junit")

libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.4" % "test"

libraryDependencies += "org.apache.storm" % "storm-core" % "0.9.5" % "test" exclude("junit", "junit")

scalacOptions ++= Seq("-feature", "-deprecation", "-Yresolve-term-conflict:package")

// When doing sbt run, fork a separate process.  This is apparently needed by storm.
fork := true

resolvers += "clojars" at "https://clojars.org/repo"
