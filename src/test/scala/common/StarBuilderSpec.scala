package cs372s15p1.scala
package common

import org.scalatest.WordSpec

trait StarBuilderSpec extends WordSpec with StarBuilder{

  "The star builder" when {
    "given an empty list of word lengths" should {
      "build the correct star tree" in {
        assert(buildStars(Iterator.empty) == StarFixtures.empty)
      }
    }

    "given a simple list of word lengths" should {
      "build the correct star tree" in {
        val allWords = Iterator(1, 1)
        assert(buildStars(allWords) == StarFixtures.simple)
      }
    }

    "given a complex list of word lengths" should {
      "build the correct star tree" in {
        val allWords = Iterator(2, 4, 5, 2, 2, 5)
        assert(buildStars(allWords) == StarFixtures.complex)
      }
    }
  }

}