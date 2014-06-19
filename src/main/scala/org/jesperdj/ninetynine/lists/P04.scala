package org.jesperdj.ninetynine.lists

object P04 {

  def length[T](xs: List[T]): Int = xs match {
    case _ :: tail => 1 + length(tail)
    case Nil => 0
  }
}
