package cs372s15p1.scala
package common

import org.scalatest.WordSpec

class CountLengthSpec extends WordSpec with IO {

  "The word length counter" when {
    "given an empty word" should {
      "return 0" in {
        assert(countLength("") == 0)
      }
    }

    "given a word with a space in it" should {
      "return 0" in {
        assert(countLength("hi there") == 0)
      }
    }

    "given a simple word" should {
      "correctly return the number of letters in the word " in {
        assert(countLength("education") == 9)
      }
    }
  }
}
