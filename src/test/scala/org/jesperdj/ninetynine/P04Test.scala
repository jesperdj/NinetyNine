package org.jesperdj.ninetynine

import org.scalatest._

class P04Test extends FlatSpec with Matchers {

  "length()" should "return 0 for empty list" in {
    P04.length(List()) should be (0)
  }

  it should "return the number of elements in a list" in {
    P04.length(List(4)) should be (1)
    P04.length(List(8, 8)) should be (2)
    P04.length(List(7, 9, 0)) should be (3)
  }
}
