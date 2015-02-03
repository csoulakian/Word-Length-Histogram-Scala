package cs372s15p1.scala.common

trait Main extends App with IO with StarBuilder {

  override def main(args: Array[String]): Unit = {
   val lines = scala.io.Source.stdin.getLines
   val words = lines.flatMap(_.split("\\W+"))
   val allWords = words.map((s: String) => countLength(s))

   val start = System.currentTimeMillis
   val wordTree = buildStars(allWords)
   val total = System.currentTimeMillis - start

   printTree(wordTree)
   println("processing time: " + total + " ms")
  }
}
