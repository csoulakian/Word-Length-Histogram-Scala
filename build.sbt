name := "cs372s15p1"

scalaVersion := "2.11.5"

libraryDependencies ++= Seq(
  "com.novocode" % "junit-interface" % "0.11" % Test,  // required only for plain JUnit testing
  "org.scalatest" %% "scalatest" % "2.2.3" % Test,
  "org.scalacheck" %% "scalacheck" % "1.11.5" % Test
)
