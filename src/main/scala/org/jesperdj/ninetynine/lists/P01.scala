package org.jesperdj.ninetynine.lists

import scala.annotation.tailrec

object P01 {

  @tailrec
  def last[T](xs: List[T]): T = xs match {
    case Nil => throw new NoSuchElementException("Empty list")
    case x :: Nil => x
    case _ :: tail => last(tail)
  }
}
