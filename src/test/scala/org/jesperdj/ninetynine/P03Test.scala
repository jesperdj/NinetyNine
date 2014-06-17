package org.jesperdj.ninetynine

import org.scalatest._

class P03Test extends FlatSpec with Matchers {

  "nth()" should "throw NoSuchElementException for empty list" in {
    a [NoSuchElementException] should be thrownBy {
      P03.nth(0, List())
    }
  }

  it should "return the first element" in {
    P03.nth(0, List(1)) should be (1)
    P03.nth(0, List(5, 8)) should be (5)
    P03.nth(0, List(7, 2, 0)) should be (7)
  }

  it should "throw NoSuchElementException when trying to get the second element of a list with one element" in {
    a [NoSuchElementException] should be thrownBy {
      P03.nth(1, List(3))
    }
  }

  it should "return the second element" in {
    P03.nth(1, List(5, 8)) should be (8)
    P03.nth(1, List(7, 2, 0)) should be (2)
  }

  it should "throw NoSuchElementException when trying to get the third element of a list with two elements" in {
    a [NoSuchElementException] should be thrownBy {
      P03.nth(2, List(5, 3))
    }
  }

  it should "return the third element" in {
    P03.nth(2, List(5, 8, 1)) should be (1)
    P03.nth(2, List(7, 2, 0, 4)) should be (0)
  }
}
