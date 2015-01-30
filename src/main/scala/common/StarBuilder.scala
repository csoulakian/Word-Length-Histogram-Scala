package cs372s15p1.scala.common

/**
 * from processtree-scala
 */
trait StarBuilder {
  def buildTree(processes: Iterator[(Int, Int, String)]): Map[Int, Seq[(Int, Int, String)]]
}
