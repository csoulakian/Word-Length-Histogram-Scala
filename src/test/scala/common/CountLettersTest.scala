package cs372s15p1.scala
package common

import org.scalatest.FunSuite
import org.scalatest.Assertions._

/**
 * Created by Chrissy on 1/29/2015.
 */
class CountLettersTest extends FunSuite with Main {

  test("A 3 letter word should count 3") {
    assert (countLength("run") == 3)
  }

  //insert tests for different types of inputs with varying # of spaces
}
