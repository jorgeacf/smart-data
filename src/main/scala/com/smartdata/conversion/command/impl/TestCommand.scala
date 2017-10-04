package com.smartdata.conversion.command.impl

import com.smartdata.conversion.command.Command

class TestCommand extends Command {

  override def execute(commandArguments: Array[String]): Unit = {
    println("TestCommand.execute")
  }

}
