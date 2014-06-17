package org.jesperdj.ninetynine

import java.util.NoSuchElementException

import org.scalatest._

class P01Test extends FlatSpec with Matchers {

  "last()" should "throw NoSuchElementException for empty list" in {
    a [NoSuchElementException] should be thrownBy {
      P01.last(List())
    }
  }

  it should "return the last element" in {
    P01.last(List(1)) should be (1)
    P01.last(List(1, 2)) should be (2)
    P01.last(List(1, 2, 3)) should be (3)
  }
}
