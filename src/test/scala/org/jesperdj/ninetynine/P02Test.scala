package org.jesperdj.ninetynine

import java.util.NoSuchElementException

import org.scalatest._

class P02Test extends FlatSpec with Matchers {
  import P02._

  "penultimate()" should "throw NoSuchElementException for empty list" in {
    a [NoSuchElementException] should be thrownBy {
      penultimate(List())
    }
  }

  it should "throw NoSuchElementException for a list with one element" in {
    a [NoSuchElementException] should be thrownBy {
      penultimate(List(1))
    }
  }

  it should "return the penultimate element" in {
    penultimate(List(1, 2)) should be (1)
    penultimate(List(1, 2, 3)) should be (2)
    penultimate(List(1, 2, 3, 4)) should be (3)
  }
}
