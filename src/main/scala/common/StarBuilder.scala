package cs372s15p1.src.main.scala.common

/**
 * from processtree-scala
 */
trait StarBuilder {
  def buildTree(processes: Iterator[(Int, Int, String)]): Map[Int, Seq[(Int, Int, String)]]
}
