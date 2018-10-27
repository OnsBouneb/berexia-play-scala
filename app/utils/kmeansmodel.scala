package utils
import javax.inject._
import org.apache.spark.{SparkConf, SparkContext}
import org.apache.spark.mllib.clustering.KMeansModel
import org.apache.spark.mllib.linalg.Vectors
import org.apache.spark.rdd
import org.apache.spark.rdd.RDDOperationScope
import com.google.common.cache.{CacheBuilder, CacheLoader}
import java.util.concurrent.TimeUnit
import play.api.mvc._
import play.api._
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits._
import javax.inject._
import org.apache.spark.mllib.clustering.KMeansModel
import org.apache.spark.mllib.linalg.Vectors
import play.api._
import play.api.mvc._

object kmeansmodel {

def predict{
    val conf = new SparkConf()
    conf.set("spark.driver.allowMultipleContexts", "true")
    conf.setMaster("local")
    conf.setAppName("test")
    val sc = new SparkContext(conf)
    val KMeansModelCache = CacheBuilder.newBuilder().maximumSize(2).refreshAfterWrite(24, TimeUnit.HOURS).build( new CacheLoader[String, KMeansModel]{
        def load(path: String): KMeansModel = {
       KMeansModel.load(sc, "/home/big/BigData/zeppelin/bin/modelclustering/clusterfinal.txt") }} )

  def getKMeansModel : KMeansModel = {
    KMeansModelCache.get("/home/big/BigData/zeppelin/bin/modelclustering/clusterfinal.txt")
  }

  }
}
