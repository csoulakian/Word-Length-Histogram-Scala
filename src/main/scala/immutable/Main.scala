package cs372s15p1.scala
package immutable

/**
 * skeleton from processtree-scala
 *
 * syntax idea for buildStars method from
 * https://groups.google.com/d/msg/scala-user/PQJ9jlJJxYs/C7rpQyq6lLgJ
 */
object Main extends common.Main with Immutable

trait Immutable extends common.StarBuilder {
  override def buildStars(allWords: Iterator[Int]): Map[Int, Int] = {
    allWords.toSeq.groupBy(identity).mapValues(_.length)
    //returns an unsorted map
  }
}
