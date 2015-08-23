package akka.sample

import actor.ReceiveActor
import akka.actor.{Props, ActorSystem}

object SampleActor extends App {
  val system = ActorSystem()
  val actor = system.actorOf(Props[ReceiveActor])

  actor ! "HelloWorld!"

  system.shutdown
}
