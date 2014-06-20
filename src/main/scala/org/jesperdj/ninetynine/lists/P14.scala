package org.jesperdj.ninetynine.lists

object P14 {

  def duplicate[T](xs: List[T]): List[T] = xs flatMap { x => List(x, x) }
}
