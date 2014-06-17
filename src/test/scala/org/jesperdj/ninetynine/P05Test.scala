package org.jesperdj.ninetynine

import org.scalatest._

class P05Test extends FlatSpec with Matchers {

  "reverse()" should "return empty list for empty list" in {
    P05.reverse(List()) should be (List())
  }

  it should "return the same list for a list with one element" in {
    P05.reverse(List(23)) should be (List(23))
  }

  it should "return the reverse list" in {
    P05.reverse(List(2, 4)) should be (List(4, 2))
    P05.reverse(List(1, 3, 5)) should be (List(5, 3, 1))
  }
}
