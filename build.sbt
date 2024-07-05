scalaVersion := "3.3.0"

libraryDependencies ++= Seq(
  "org.http4s" %% "http4s-ember-server" % "1.0.0-M33",
  "org.http4s" %% "http4s-dsl" % "1.0.0-M33",
  "org.typelevel" %% "cats-effect" % "3.4.2"
)

Compile / run / mainClass := Some("HelloWorldServer")
