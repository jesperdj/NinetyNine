package org.jesperdj.ninetynine.lists

import org.scalatest._

class P09Test extends FlatSpec with Matchers {
  import P09._

  "pack()" should "return empty list for empty list" in {
    pack(List()) should be (List())
  }

  "pack()" should "return a list of lists with single elements when there are no consecutive duplicates" in {
    pack(List(1, 2, 1, 3)) should be (List(List(1), List(2), List(1), List(3)))
  }

  "pack()" should "return a list of lists grouped by consecutive duplicates" in {
    pack(List(2, 2)) should be (List(List(2, 2)))
    pack(List('a, 'a, 'b)) should be (List(List('a, 'a), List('b)))
    pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) should be (List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e)))
  }
}
