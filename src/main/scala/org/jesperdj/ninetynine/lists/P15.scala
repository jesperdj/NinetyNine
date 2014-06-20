package org.jesperdj.ninetynine.lists

object P15 {

  def duplicateN[T](n: Int, xs: List[T]): List[T] = xs flatMap { x => for (i <- 1 to n) yield x }
}
