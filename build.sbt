name := "cs372s15p1"

scalaVersion := "2.11.5"

libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.3" % Test

ScoverageSbtPlugin.ScoverageKeys.coverageExcludedPackages := """.*\.common\.Main"""
