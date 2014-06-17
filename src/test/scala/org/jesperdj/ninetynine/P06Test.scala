package org.jesperdj.ninetynine

import org.scalatest._

class P06Test extends FlatSpec with Matchers {
  import P06._

  "isPalindrome()" should "return true for empty list" in {
    isPalindrome(List()) should be (true)
  }

  it should "return true for a list with one element" in {
    isPalindrome(List(45)) should be (true)
  }

  it should "return true for palindromic lists with an even number of elements" in {
    isPalindrome(List(3, 3)) should be (true)
    isPalindrome(List(7, 4, 4, 7)) should be (true)
  }

  it should "return false for non-palindromic lists with an even number of elements" in {
    isPalindrome(List(3, 2)) should be (false)
    isPalindrome(List(7, 7, 1, 7)) should be (false)
  }

  it should "return true for palindromic lists with an odd number of elements" in {
    isPalindrome(List(3, 3, 3)) should be (true)
    isPalindrome(List(5, 2, 5)) should be (true)
    isPalindrome(List(9, 0, 66, 0, 9)) should be (true)
  }

  it should "return false for non-palindromic lists with an odd number of elements" in {
    isPalindrome(List(3, 3, 2)) should be (false)
    isPalindrome(List(4, 5, 6, 5, 3)) should be (false)
  }
}
