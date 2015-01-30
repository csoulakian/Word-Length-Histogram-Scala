package cs372s15p1.scala.common

object Main extends App with IO {

   override def main(args: Array[String]): Unit = {
     val lines = scala.io.Source.stdin.getLines
     val words = lines.flatMap(_.split("\\W+"))


    for(thing <- words){
        println(thing)
    }
     //println(words.next())
/*    words.foreach {
      println
    }*/

    //val words = allLines.flatMap(_.split("\\W+"))

    //val myWord = words.next()
    //val count = countLetters(myWord)




    // it map f
    // The iterator obtained from applying the function "f"
    // to every element returned from "it"

    //val allWords = words map count
/*    val allValues = while(words.hasNext){
      def myWord = words.next()
      countLetters(myWord)
    }*/


/*    val start = System.currentTimeMillis
    val processTree = buildTree(processes)
    val total = System.currentTimeMillis - start

    printTree(processTree)
    println("processing time: " + total + " ms")*/
  }

}
