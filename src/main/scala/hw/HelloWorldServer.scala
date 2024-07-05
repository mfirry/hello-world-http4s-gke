import cats.effect._
import org.http4s.HttpRoutes
import com.comcast.ip4s._
import org.http4s.dsl.io._
import org.http4s.ember.server.EmberServerBuilder

object HelloWorldServer extends IOApp:
  def run(args: List[String]): IO[ExitCode] =
    val httpApp = HttpRoutes.of[IO]:
      case GET -> Root / "hello" => Ok("Hello, World!")
    .orNotFound

    EmberServerBuilder.default[IO]
      .withHost(host"0.0.0.0")
      .withPort(port"8080")
      .withHttpApp(httpApp)
      .build
      .use(_ => IO.never)
      .as(ExitCode.Success)
