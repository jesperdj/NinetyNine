package org.jesperdj.ninetynine

object P04 {

  def length[T](xs: List[T]): Int = xs match {
    case Nil => 0
    case _ :: tail => 1 + length(tail)
  }
}
