package cs372s15p1.scala
package mutable

/**
 * Created by Chrissy on 2/1/2015.
 */
object Main extends common.Main with Mutable

trait Mutable extends common.StarBuilder {

  import scala.collection.mutable.{ArrayBuffer, Buffer, HashMap}

  val CHILD_LIST_SIZE = 16

  override def buildStars(allWords: Iterator[Int]):
  Map[Int, Int] = {
    val treeMap = new HashMap[Int, Buffer[(Int, Int, String)]]
    while (processes.hasNext) {
      val tuple = processes.next()
      val (pid, ppid, cmd) = tuple
      if (! treeMap.contains(ppid)) {
        treeMap += ((ppid, new ArrayBuffer[(Int, Int, String)](CHILD_LIST_SIZE)))
      }
      treeMap(ppid) += tuple
    }
    treeMap.toMap
  }
}