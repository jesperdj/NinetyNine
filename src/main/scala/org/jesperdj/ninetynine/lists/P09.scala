package org.jesperdj.ninetynine.lists

object P09 {

  def pack[T](xs: List[T]): List[List[T]] = xs match {
    case x1 :: x2 :: tail if x1 == x2 => pack(x2 :: tail) match {
      case h :: t => (x1 :: h) :: t
      case Nil => Nil
    }

    case x1 :: x2 :: tail if x1 != x2 => List(x1) :: pack(x2 :: tail)

    case _ :: Nil => List(xs)

    case Nil => Nil
  }
}
