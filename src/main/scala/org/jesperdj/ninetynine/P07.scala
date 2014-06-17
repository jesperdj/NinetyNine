package org.jesperdj.ninetynine

object P07 {

  // Ugly that it's not more type-safe
  def flatten(xs: List[_]): List[_] = xs match {
    case (head: List[_]) :: tail => flatten(head) ::: flatten(tail)
    case head :: tail => head :: flatten(tail)
    case Nil => Nil
  }
}
