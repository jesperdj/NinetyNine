package org.jesperdj.ninetynine.lists

import org.scalatest._

class P11Test extends FlatSpec with Matchers {
  import P11._

  "encodeModified()" should "return empty list for empty list" in {
    encodeModified(List()) should be (List())
  }

  "encodeModified()" should "return the same list" in {
    encodeModified(List(1, 2, 1, 3)) should be (List(1, 2, 1, 3))
  }

  "encodeModified()" should "return a list of elements with the correct counts" in {
    encodeModified(List(3, 3)) should be (List((2, 3)))
    encodeModified(List(4, 4, 4)) should be (List((3, 4)))
    encodeModified(List('a, 'a, 'b)) should be (List((2, 'a), 'b))
    encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) should be (List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e)))
  }
}
