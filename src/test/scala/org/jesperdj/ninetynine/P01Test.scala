package org.jesperdj.ninetynine

import java.util.NoSuchElementException

import org.scalatest._

class P01Test extends FlatSpec with Matchers {
  import P01._

  "last()" should "throw NoSuchElementException for empty list" in {
    a [NoSuchElementException] should be thrownBy {
      last(List())
    }
  }

  it should "return the last element" in {
    last(List(1)) should be (1)
    last(List(1, 2)) should be (2)
    last(List(1, 2, 3)) should be (3)
  }
}
