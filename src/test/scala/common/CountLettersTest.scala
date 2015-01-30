package cs372s15p1.scala
package common

import org.scalatest.FunSuite
import org.scalatest.Assertions._

/**
 * Created by Chrissy on 1/29/2015.
 */
class CountLettersTest extends FunSuite with IO {

  test("A 3 letter word should count 3") {
    assert (countLetters("run") == 3)
  }

  test("list of words") {
    val words = ("dog", "turtle")
    //assert (countLetters(words) == (3, 6))
  }
}
