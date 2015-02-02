package cs372s15p1.scala
package mutable

/**
 * Created by Chrissy on 2/1/2015.
 */
object Main extends common.Main with Mutable

trait Mutable extends common.StarBuilder {

  import scala.collection.mutable.HashMap

  override def buildStars(allWords: Iterator[Int]): Map[Int, Int] = {
    val treeMap = new HashMap[Int, Int]
    while (allWords.hasNext) {
      val wordLength = allWords.next()
      if (! treeMap.contains(wordLength)) {
        treeMap += (wordLength -> 1)
      }
      else {
        treeMap(wordLength) += 1
      }
    }
    treeMap.toMap
  }
}