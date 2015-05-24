package akka.sample.actor

import akka.actor.Actor

class ReceiveActor extends Actor {
  def receive = {
    case x => println(x)
  }
}
