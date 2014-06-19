package org.jesperdj.ninetynine.lists

import org.scalatest._

class P08Test extends FlatSpec with Matchers {
  import P08._

  "compress()" should "return empty list for empty list" in {
    compress(List()) should be (List())
  }

  "compress()" should "return them same list when there are no consecutive duplicate elements" in {
    compress(List(1, 2, 1, 3)) should be (List(1, 2, 1, 3))
  }

  "compress()" should "remove consecutive duplicate elements" in {
    compress(List(2, 2)) should be (List(2))
    compress(List(4, 4, 4)) should be (List(4))
    compress(List('a, 'a, 'b)) should be (List('a, 'b))
    compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) should be (List('a, 'b, 'c, 'a, 'd, 'e))
  }
}
