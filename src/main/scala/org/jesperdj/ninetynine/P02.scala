package org.jesperdj.ninetynine

object P02 {

  def penultimate[T](xs: List[T]): T = xs match {
    case Nil => throw new NoSuchElementException("Empty list")
    case x :: _ :: Nil => x
    case _ :: tail => penultimate(tail)
  }
}
