package org.jesperdj.ninetynine.lists

import org.scalatest._

class P14Test extends FlatSpec with Matchers {
  import P14._

  "duplicate()" should "return empty list for empty list" in {
    duplicate(List()) should be (List())
  }

  "duplicate()" should "return a list with all elements duplicated" in {
    duplicate(List(0)) should be (List(0, 0))
    duplicate(List('a, 'a, 'b)) should be (List('a, 'a, 'a, 'a, 'b, 'b))
    duplicate(List('a, 'b, 'c, 'c, 'd)) should be (List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd))
  }
}
