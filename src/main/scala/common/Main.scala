package cs372s15p1.scala.common

trait Main extends App with IO {

   override def main(args: Array[String]): Unit = {

     val lines = scala.io.Source.stdin.getLines
     val words = lines.flatMap(_.split("\\W+"))

     val allWords = words.map((s: String) => countLength(s))

/*    val start = System.currentTimeMillis
    val processTree = buildTree(processes)
    val total = System.currentTimeMillis - start

    printTree(processTree)
    println("processing time: " + total + " ms")*/
  }

}
