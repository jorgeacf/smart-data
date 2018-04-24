package com.smartdata.conversion

import com.smartdata.conversion.commandline.CommandLineParser
import org.slf4j.LoggerFactory

object ConversionMain {

  //private val headTitle = "Smart Data"
  //private val serviceName = "Conversion Services"
  //private val serviceVersion = "1.0.0"

  private val logger = LoggerFactory.getLogger(getClass)

  def main(arguments: Array[String]): Unit = {
    logger.info(s"Starting {$serviceName}, Version {$serviceVersion}")
    //val commandLineParser = new CommandLineParser(headTitle, serviceName, serviceVersion)
    //commandLineParser.parse(arguments)
    logger.info(s"Stopping {$serviceName}")
  }

}
