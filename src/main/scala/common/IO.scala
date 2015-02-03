package cs372s15p1.scala.common

/**
 * skeleton from processtree-scala
 *
 * repeat stars on string from
 * http://rosettacode.org/wiki/Repeat_a_string#Scala
 */

import java.io.{BufferedWriter, OutputStreamWriter}

trait IO {

  def countLength(word: String): Int = {
    if(word.contains(" ")){
      0
    }
    else word.length
  }

  val IO_BUF_SIZE = 8192

  implicit val stdout = new BufferedWriter(new OutputStreamWriter(System.out), IO_BUF_SIZE)

  def printTree
  (wordTree: Map[Int, Int]) (implicit stdout: BufferedWriter): Unit = {
    if(wordTree.nonEmpty) {
      for (i: Int <- 1 to wordTree.keysIterator.max) {
        stdout.write(i + " ")
        if (wordTree.contains(i)) {
          stdout.append(wordTree(i) + " " + "*" * wordTree(i))
        }
        else stdout.append("0")
        stdout.newLine()
      }
      stdout.flush()
    }
  }
}
