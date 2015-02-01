package cs372s15p1.scala.common

/**
 * from processtree-scala
 */

import java.io.{BufferedWriter, OutputStreamWriter}

import scala.collection.JavaConversions.enumerationAsScalaIterator
import scala.math.max

trait IO {

  def countLength(word: String): Int = {
    word.length
  }

  val IO_BUF_SIZE = 8192

  implicit val stdout = new BufferedWriter(new OutputStreamWriter(System.out), IO_BUF_SIZE)

  def printTree
  (processTree: Map[Int, Seq[(Int, Int, String)]])
  (implicit out: BufferedWriter)
  : Unit = {
    printTree(processTree, 0, 0)(out)
    out.flush()
  }

  def printTree
  (processTree: Map[Int, Seq[(Int, Int, String)]], pid: Int, indent: Int)
  (implicit out: BufferedWriter)
  : Unit = {
    for (children <- processTree.get(pid); (cpid, _, cmd) <- children) {
      for (_ <- 1 to indent) out.append(' ')
      out.append(cpid.toString)
      out.append(": ")
      out.append(cmd)
      out.newLine()
      printTree(processTree, cpid, indent + 1)(out)
    }
  }
}
