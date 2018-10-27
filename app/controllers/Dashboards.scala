package controllers
import play.api.mvc._
import javax.inject._
import org.apache.spark.mllib.clustering.KMeansModel
import org.apache.spark.mllib.linalg.Vectors
import vegas._
import vegas.sparkExt._
import org.apache.spark._
import vegas.render.WindowRenderer._
import org.apache.spark.sql.{DataFrame, SparkSession}
import org.apache.spark.{SparkConf, SparkContext}
import org.apache.spark.rdd
import org.apache.spark.rdd.RDDOperationScope
import com.google.common.cache.{CacheBuilder, CacheLoader}
import java.util.concurrent.TimeUnit
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits._
import play.api._
import org.apache.hadoop.conf.Configuration
import org.apache.hadoop.fs.FileSystem
import org.apache.hadoop.fs.Path
import java.io.PrintWriter
import java.io.InputStream
import java.net.URI
import java.net.URLDecoder

object Dashboards extends Controller {

def getSparkSessionInstance = {

    sparkSession }

  
 var  sparkSession = SparkSession.builder.master("local").appName("ApplicationController").getOrCreate()
val datacdr = sparkSession.read.format("csv").option("header", "true").option("charset", "UTF8").option("delimiter", ",").load("/home/big/te.csv")
val datacdr1 = sparkSession.read.format("csv").option("header", "true").option("charset", "UTF8").option("delimiter", ",").load("/home/big/ti.csv")








}
