package akka.sample

import actor.ReceiveActor
import akka.actor.{Props, ActorSystem}

object SampleActor extends App {
  val system = ActorSystem("sample")
  val actor = system.actorOf(Props[ReceiveActor], "hoge")

  actor ! "HelloWorld!"

  system.shutdown
}
