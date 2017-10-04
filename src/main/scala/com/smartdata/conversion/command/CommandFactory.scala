package com.smartdata.conversion.command

import scaldi.{Injectable, Injector}

object CommandFactory extends Injectable {

  def makeCommandInstance(commandName: String,
                           commandArguments: Array[String] = Array())(implicit inj: Injector): Option[Command] = {

    val commandClassFullName = inject[String] (identified by "command.package")

    try {
      val commandClass = Class.forName(s"${commandClassFullName}.${commandName}")
      val commandConstructor = commandClass.getConstructor()
      val commandInstance = commandConstructor.newInstance()

      commandInstance match {
        case command: Command => Some(command)
        case _ => None
      }
    }
    catch {
      case exception: Exception => {
        None
      }
    }
  }

}
