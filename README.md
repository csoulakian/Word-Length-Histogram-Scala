COMP 372 - Programming Languages
Spring 2015
Project 1 - based on [processtree-scala](https://github.com/LoyolaChicagoCode/processtree-scala)

# Overview

This program reads in an arbitrary number of words from the standard input and keeps track of the distribution of word lengths.
After the end of the input is reached, the program prints a text-based histogram of the distribution of word lengths.
From one up to the length of the longest word, it prints the number of words of that length as a number (possibly zero)
and as a bar consisting of asterisks (possibly empty).

For example, if the input is

    hello hello
        world goodbye hello
      world good bye

then the output is

    1 0
    2 0
    3 1 *
    4 1 *
    5 5 *****
    6 0
    7 1 *

If the input is empty, so is the output.

# Testing

To run the tests:

    sbt test

To determine test coverage:

    sbt coverage test

Then open this file in a web browser:

    target/scala-2.11/scoverage-report/index.html

# Running the Program

To run the main methods:

    sbt "runMain cs372s15p1.scala.mutable.Main"
    sbt "runMain cs372s15p1.scala.immutable.Main"

To run the main methods with the optional sample text file:

    sbt "runMain cs372s15p1.scala.mutable.Main" < sample.txt
    sbt "runMain cs372s15p1.scala.immutable.Main" < sample.txt

