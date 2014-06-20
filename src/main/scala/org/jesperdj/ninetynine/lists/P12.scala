package org.jesperdj.ninetynine.lists

object P12 {

  def decode[T](xs: List[(Int, T)]): List[T] = xs flatMap { case (c, x) => for (i <- 1 to c) yield x }
}
