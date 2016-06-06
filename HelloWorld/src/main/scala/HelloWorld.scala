import akka.actor.Actor

case class Hello(name: String)

class HelloWorld extends Actor {
  def receive = {
    case Hello(name) => println(s"Hello $name")
    case _ => println("Unknown message recieved")
  }
}
