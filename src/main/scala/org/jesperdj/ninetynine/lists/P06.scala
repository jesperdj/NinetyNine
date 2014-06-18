package org.jesperdj.ninetynine.lists

object P06 {

  def isPalindrome[T](xs: List[T]): Boolean = xs == P05.reverse(xs)
}
