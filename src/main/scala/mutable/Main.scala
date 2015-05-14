package cs372s15p1.scala
package mutable

import scala.collection.mutable

/**
 * skeleton from processtree-scala
 */
object Main extends common.Main with Mutable

trait Mutable extends common.StarBuilder {

  override def buildStars(allWords: Iterator[Int]): Map[Int, Int] = {
    val treeMap = new mutable.HashMap[Int, Int]
    while (allWords.hasNext) {
      val wordLength = allWords.next()
      if (! treeMap.contains(wordLength)) {
        treeMap += (wordLength -> 1)
      }
      else treeMap(wordLength) += 1
    }
    treeMap.toMap
  }
}