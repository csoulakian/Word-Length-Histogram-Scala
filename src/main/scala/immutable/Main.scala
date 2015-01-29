package cs372s15p1.src.main.scala
package immutable

/**
 * from processtree-scala
 */
object Main extends common.Main with Immutable

trait Immutable extends common.StarBuilder {
  override def buildTree(processes: Iterator[(Int, Int, String)]):
  Map[Int, Seq[(Int, Int, String)]] =
    processes.toSeq groupBy { _._2 }
}