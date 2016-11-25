package com.study.Hello

/**
  * Created by Evan_Zhao01 on 2016/11/24.
  */
object FirstScala {
  def main(args: Array[String]){
    //println("Hello Spark&Scala")
    //for(arg <- args){
    //  println(arg)
    //}
    var capital = Map("US"->"Washington", "France" ->"Paris")
    capital +=("Japan" -> "Tokyo")
    println(capital)
    println(capital("US"))
    println(max(333,777))
    args.foreach((arg:String)=>println(arg))
    println("~~~~~~~~~~~~~~~~~~~~~~~")
    var num=0
    while(num<args.length){
      println(args(num))
      num += 1
    }
  }

  def max(x:Int,y:Int):Int={
    if(x>y)x
    else y
  }
}

