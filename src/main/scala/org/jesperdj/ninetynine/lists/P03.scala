package org.jesperdj.ninetynine.lists

import scala.annotation.tailrec

object P03 {

  @tailrec
  def nth[T](n: Int, xs: List[T]): T = xs match {
    case Nil => throw new NoSuchElementException("Empty list")
    case x :: _ if n == 0 => x
    case _ :: tail => nth(n - 1, tail)
  }
}
