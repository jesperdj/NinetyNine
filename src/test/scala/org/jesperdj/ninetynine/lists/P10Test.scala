package org.jesperdj.ninetynine.lists

import org.scalatest._

class P10Test extends FlatSpec with Matchers {
  import P10._

  "encode()" should "return empty list for empty list" in {
    encode(List()) should be (List())
  }

  "encode()" should "return a list of tuples each with count 1" in {
    encode(List(1, 2, 1, 3)) should be (List((1, 1), (1, 2), (1, 1), (1, 3)))
  }

  "encode()" should "return a list of tuples with the correct counts" in {
    encode(List(3, 3)) should be (List((2, 3)))
    encode(List(4, 4, 4)) should be (List((3, 4)))
    encode(List('a, 'a, 'b)) should be (List((2, 'a), (1, 'b)))
    encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) should be (List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e)))
  }
}
