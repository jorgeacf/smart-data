import org.apache.spark.{SparkConf, SparkContext}

object MainApp {

  def main(args: Array[String]): Unit = {

    val sparkConf = new SparkConf()
    sparkConf.setAppName("Datalab application")
    sparkConf.setMaster("local[*]")
    //sparkConf.set("spark.ui.showConsoleProgress", "false")
    sparkConf.set("spark.driver.allowMultipleContexts", "true")
    val sparkContext = new SparkContext(sparkConf)

    val list = sparkContext.parallelize(List(1, 2, 3, 4, 5),1).map(_ * 2)

    list.foreach(println)

  }

}
