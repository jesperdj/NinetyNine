package org.jesperdj.ninetynine.lists

import org.scalatest._

class P13Test extends FlatSpec with Matchers {
  import P13._

  "encodeDirect()" should "return empty list for empty list" in {
    encodeDirect(List()) should be (List())
  }

  "encodeDirect()" should "return a list of tuples each with count 1" in {
    encodeDirect(List(1, 2, 1, 3)) should be (List((1, 1), (1, 2), (1, 1), (1, 3)))
  }

  "encodeDirect()" should "return a list of tuples with the correct counts" in {
    encodeDirect(List(3, 3)) should be (List((2, 3)))
    encodeDirect(List(4, 4, 4)) should be (List((3, 4)))
    encodeDirect(List('a, 'a, 'b)) should be (List((2, 'a), (1, 'b)))
    encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) should be (List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e)))
  }
}
