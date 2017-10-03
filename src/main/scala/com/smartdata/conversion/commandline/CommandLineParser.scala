package com.smartdata.conversion.commandline

import org.slf4j.LoggerFactory
import scopt.OptionParser

trait CommandLineParser {

  private val logger = LoggerFactory.getLogger(getClass)

  protected def parser: OptionParser[ConversionCommandLineParameters]

  def parse(arguments: Array[String]): Unit = {
    val commandLineParser = parser
    commandLineParser.parse(arguments, ConversionCommandLineParameters()) match {
      case Some(commandLineParameters) => {
        try {
          //implicit val injector = new ConversionModule(commandLineParameters)
          //val command = CommandFactory.getCommand(commandLineParameters)
          //command.execute()
        } catch {
          case exception: Exception => {
            val message = s"Error executing command with arguments=[${arguments.mkString(" ")}] " +
              s"throwing exception=[${exception.getMessage}]"
            logger.error(message, exception)
            throw exception
          }
        }
      }
      case None => {
        logger.error(s"Failed to parse input parameters from args={${arguments.deep.mkString(",")}}")
        commandLineParser.showUsage
        System.exit(1)
      }
    }
  }

}
