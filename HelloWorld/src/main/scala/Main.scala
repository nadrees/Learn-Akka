import akka.actor.{ActorSystem, Props}

object Main extends App {
  val system = ActorSystem("HelloWorld")
  val helloActor = system.actorOf(Props[HelloWorld], name = "HelloWorld")

  helloActor ! Hello("Nathen")
  helloActor ! "Something else"
}
