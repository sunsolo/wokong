package config

/**
  * Created by C.J.YOU on 2016/1/18.
  * 本地目录配置文件
  */
object FileConfig {

  var ROOT_DIR = "/home/telecom/data"
  var SEARCH_ENGINE_DATA ="/home/telecom/SearchEngineData"
  var TOO_BIG_VALUE="/home/telecom/ErrorData"
  val test_dir = "F:\\datatest\\telecom"

  def  rootDir(dir:String): Unit = {
    ROOT_DIR = dir
  }

  def searchEngineDir(dir:String):Unit ={
    SEARCH_ENGINE_DATA = dir
  }

  def errorDataDir(dir:String):Unit = {
    TOO_BIG_VALUE = dir
  }
}