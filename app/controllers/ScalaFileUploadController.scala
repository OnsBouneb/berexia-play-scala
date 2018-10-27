package controllers
import java.nio.file.Paths

import models.User
import javax.inject._
import org.apache.spark.mllib.clustering.KMeansModel
import org.apache.spark.mllib.tree.model.DecisionTreeModel
import org.apache.spark.mllib.linalg.Vectors
//import vegas._
//import vegas.sparkExt._
//import vegas.render.WindowRenderer._
//import vegas.DSL.SpecBuilder
//import vegas.DSL.OptArg
import org.apache.spark.sql.{Encoder,Encoders}
import scala.reflect.ClassTag
import org.apache.spark._
import org.apache.spark.sql.functions._
import vegas.render.WindowRenderer._
import org.apache.spark.sql.{DataFrame, SparkSession}
import org.apache.spark.{SparkConf, SparkContext}
import org.apache.spark.sql.SQLContext
import org.apache.spark.rdd
import org.apache.spark.rdd.RDDOperationScope
import com.google.common.cache.{CacheBuilder, CacheLoader}
import java.util.concurrent.TimeUnit
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits._
import play.api._
import play.api.mvc._
import org.apache.hadoop.conf.Configuration
import org.apache.hadoop.fs.FileSystem
import org.apache.hadoop.fs.Path
import java.io.PrintWriter
import java.io.InputStream
import java.net.URI
import java.net.URLDecoder
import utils.kmeansmodel
import org.apache.spark.sql.types._
import com.knockdata.spark.highcharts._
import com.knockdata.spark.highcharts.model._
import org.junit.Assert._
import org.junit.Test
import java.io.PrintWriter
import scala.io.Source
import  java.lang.Double
import org.apache.spark.sql.functions.{unix_timestamp, to_date}
import  play.api.mvc.Action
import play.api.libs.json._
import java.io.File

//import  com.crealytics.spark.excel


object ScalaFileUploadController extends Controller {
val conf = new SparkConf()
    conf.set("spark.driver.allowMultipleContexts", "true")
    conf.setMaster("local")
    conf.setAppName("test")
    val sc = new SparkContext(conf)
    val sqlContext = new SQLContext(sc)

var  sparkSession = SparkSession.builder.master("local").appName("ApplicationController").getOrCreate()

def upload = Action(parse.multipartFormData) { request =>
  request.body.file("file").map { file =>

    // only get the last part of the filename
    // otherwise someone can send a path like ../../home/foo/bar.txt to write to other files on the system
    val filename = Paths.get(file.filename).getFileName
    //val k = s"/home/onsbouneb/Pictures/playapp/datause/$filename"
//    file.ref.moveTo(Paths.get(k)
    file.ref.file.renameTo(new File("/home/onsbouneb/Pictures/playapp/datause/"+filename))
print("File uploaded")
    Ok("File uploaded")
  }.getOrElse {
    Redirect("/").flashing(
      "error" -> "Missing file")
  }

}




}
