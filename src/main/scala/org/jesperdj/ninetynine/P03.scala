package org.jesperdj.ninetynine

object P03 {

  def nth[T](n: Int, xs: List[T]): T = xs match {
    case Nil => throw new NoSuchElementException("Empty list")
    case x :: _ if n == 0 => x
    case _ :: tail => nth(n - 1, tail)
  }
}
