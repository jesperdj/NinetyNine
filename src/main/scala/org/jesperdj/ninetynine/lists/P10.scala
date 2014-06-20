package org.jesperdj.ninetynine.lists

object P10 {
  import P09._

  def encode[T](xs: List[T]): List[(Int, T)] = pack(xs) map { ys => (ys.size, ys.head) }
}
