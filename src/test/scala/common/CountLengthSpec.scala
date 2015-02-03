package cs372s15p1.scala
package common

import org.scalatest.WordSpec

/**
 * Created by Chrissy on 2/2/2015.
 */
class CountLengthSpec extends WordSpec with IO {

  "The word length counter" when {
    "given an empty word" should {
      "reject this argument" in {
        intercept[IllegalArgumentException] {
          countLength("")
        }
      }
    }

    "given a word with a space in it" should {
      "reject this argument" in {
        intercept[IllegalArgumentException] {
          countLength("hi there")
        }
      }
    }

    "given a simple word" should {
      "correctly return the number of letters in the word " in {
        assert(countLength("education") == 9)
      }
    }
  }

}
