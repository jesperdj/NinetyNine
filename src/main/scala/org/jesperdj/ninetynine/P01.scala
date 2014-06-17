package org.jesperdj.ninetynine

object P01 {

  def last[T](xs: List[T]): T = xs match {
    case Nil => throw new NoSuchElementException("Empty list")
    case x :: Nil => x
    case _ :: tail => last(tail)
  }
}
