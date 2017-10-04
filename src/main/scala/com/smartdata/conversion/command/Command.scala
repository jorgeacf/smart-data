package com.smartdata.conversion.command


trait Command {

  def execute(commandArguments: Array[String] = Array()): Unit

}
