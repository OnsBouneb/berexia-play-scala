package controllers
import models.Time
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
import play.api.mvc._
import org.apache.hadoop.conf.Configuration
import org.apache.hadoop.fs.FileSystem
import org.apache.hadoop.fs.Path
import java.io.PrintWriter
import java.io.InputStream
import java.net.URI
import java.net.URLDecoder
import utils.kmeansmodel

object Application1 extends Controller {

def home1(id : String,id1 : String) = Action {
    Ok(views.html.charts.reporting(id,id1))
  }
 }
