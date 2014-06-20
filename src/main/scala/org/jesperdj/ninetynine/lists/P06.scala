package org.jesperdj.ninetynine.lists

object P06 {
  import P05._

  def isPalindrome[T](xs: List[T]): Boolean = xs == reverse(xs)
}
