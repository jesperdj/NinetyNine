package org.jesperdj.ninetynine.lists

object P13 {

  def encodeDirect[T](xs: List[T]): List[(Int, T)] = xs match {
    case x1 :: x2 :: tail if x1 == x2 => encodeDirect(x2 :: tail) match {
      case (c, x) :: t => (c + 1, x) :: t
      case Nil => Nil
    }

    case x1 :: x2 :: tail if x1 != x2 => (1, x1) :: encodeDirect(x2 :: tail)

    case x :: Nil => List((1, x))

    case Nil => Nil
  }
}
