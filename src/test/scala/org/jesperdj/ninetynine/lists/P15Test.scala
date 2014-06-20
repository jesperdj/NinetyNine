package org.jesperdj.ninetynine.lists

import org.scalatest._

class P15Test extends FlatSpec with Matchers {
  import P15._

  "duplicateN()" should "return empty list for empty list" in {
    duplicateN(0, List()) should be (List())
    duplicateN(1, List()) should be (List())
    duplicateN(4, List()) should be (List())
  }

  "duplicateN()" should "return empty list when n is 0" in {
    duplicateN(0, List(2)) should be (List())
    duplicateN(0, List(3, 5, 7)) should be (List())
  }

  "duplicateN()" should "return the same list when n is 1" in {
    duplicateN(1, List(2)) should be (List(2))
    duplicateN(1, List(3, 5, 7)) should be (List(3, 5, 7))
  }

  "duplicateN()" should "return each element n times" in {
    duplicateN(2, List(2)) should be (List(2, 2))
    duplicateN(3, List(3, 5, 7)) should be (List(3, 3, 3, 5, 5, 5, 7, 7, 7))
    duplicateN(3, List('a, 'b, 'c, 'c, 'd)) should be (List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd))
  }
}
