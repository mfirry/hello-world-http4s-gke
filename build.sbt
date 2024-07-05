scalaVersion := "3.3.3"

libraryDependencies ++= Seq(
  "org.http4s" %% "http4s-ember-server" % "1.0.0-M41",
  "org.http4s" %% "http4s-dsl" % "1.0.0-M41",
  "org.typelevel" %% "log4cats-slf4j" % "2.7.0"
)

Compile / run / mainClass := Some("HelloWorldServer")
