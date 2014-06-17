package org.jesperdj.ninetynine

import org.scalatest._

class P07Test extends FlatSpec with Matchers {
  import P07._

  "flatten()" should "return empty list for empty list" in {
    flatten(List()) should be (List())
  }

  it should "flatten the input list" in {
    flatten(List(1)) should be (List(1))
    flatten(List(1, 2)) should be (List(1, 2))
    flatten(List(List(1))) should be (List(1))
    flatten(List(List(1), 2)) should be (List(1, 2))
    flatten(List(List(1), List(2, List(3, 4)))) should be (List(1, 2, 3, 4))
    flatten(List(List(1, 1), 2, List(3, List(5, 8)))) should be (List(1, 1, 2, 3, 5, 8))
  }
}
