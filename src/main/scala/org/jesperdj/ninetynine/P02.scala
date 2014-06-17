package org.jesperdj.ninetynine

import scala.annotation.tailrec

object P02 {

  @tailrec
  def penultimate[T](xs: List[T]): T = xs match {
    case Nil => throw new NoSuchElementException("Empty list")
    case x :: _ :: Nil => x
    case _ :: tail => penultimate(tail)
  }
}
