package org.jesperdj.ninetynine.lists

object P05 {

  def reverse[T](xs: List[T]): List[T] = xs match {
    case Nil => Nil
    case _ :: Nil => xs
    case x :: tail => reverse(tail) :+ x
  }
}
