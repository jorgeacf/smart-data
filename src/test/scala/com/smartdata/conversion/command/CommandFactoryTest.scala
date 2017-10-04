package com.smartdata.conversion.command

import org.junit.runner.RunWith
import org.scalatest.{FlatSpec, Matchers}
import org.scalatest.junit.JUnitRunner
import scaldi.Module

@RunWith(classOf[JUnitRunner])
class CommandFactoryTest  extends FlatSpec with Matchers {


  implicit val injector = new Module {
    binding identifiedBy "command.package" to "com.smartdata.conversion.command.impl"
  }

  behavior of "makeCommandInstance"

  it should "" in {

    val command = CommandFactory.makeCommandInstance("TestCommand")
    command.foreach(_.execute())

  }

}
