package org.jesperdj.ninetynine.lists

import org.scalatest._

class P12Test extends FlatSpec with Matchers {
  import P12._

  "decode()" should "return empty list for empty list" in {
    decode(List()) should be (List())
  }

  "decode()" should "repeat elements correctly" in {
    decode(List((1, 2))) should be (List(2))
    decode(List((2, 3))) should be (List(3, 3))
    decode(List((3, 4))) should be (List(4, 4, 4))
    decode(List((2, 'a), (1, 'b))) should be (List('a, 'a, 'b))
    decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))) should be (List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  }
}
