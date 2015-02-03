package cs372s15p1.scala
package common

import java.io.{BufferedWriter, StringWriter}
import org.scalatest.WordSpec

/**
 * Created by Chrissy on 2/2/2015.
 */
class PrintSpec extends WordSpec with IO{

  val EOL = System.lineSeparator

  def fixture() = new {
    val stringWriter = new StringWriter
    implicit val strout = new BufferedWriter(stringWriter, IO_BUF_SIZE)
  }

  "The string writer" when {
    "when used through a buffered writer" should {
      "return the output as a string" in {
        val f = fixture()
        f.strout.append("asdf")
        f.strout.flush()
        assert(f.stringWriter.toString == "asdf")
      }
    }
  }

  "The stars printer" when {
    "given an empty star tree" should {
      "print this tree correctly" in {
        val f = fixture()
        printTree(StarFixtures.empty)(f.strout)
        assert(f.stringWriter.toString == "")
      }
    }

    "given a simple star tree" should {
      "print this tree correctly" in {
        val f = fixture()
        printTree(StarFixtures.simple)(f.strout)
        assert(f.stringWriter.toString == "1 2 **" + EOL)
      }
    }

    "given a complex star tree" should {
      "print this tree correctly" in {
        val f = fixture()
        printTree(StarFixtures.complex)(f.strout)
        assert(f.stringWriter.toString ==
          """|1 0
            |2 3 ***
            |3 0
            |4 1 *
            |5 2 **
            |""".stripMargin)
      }
    }
  }
}
