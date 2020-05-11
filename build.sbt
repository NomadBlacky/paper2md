ThisBuild / scalaVersion := "2.13.2"
ThisBuild / organization := "com.github.nomadblacky"
ThisBuild / organizationName := "NomadBlacky"

lazy val root = (project in file("."))
  .settings(
    name := "paper2md",
    libraryDependencies ++= Seq(
        "org.scalatest" %% "scalatest" % "3.1.2" % Test
      )
  )
