package org.jesperdj.ninetynine.lists

object P09 {

  def pack[T](xs: List[T]): List[List[T]] = xs match {
    case x1 :: x2 :: tail if x1 == x2 =>
      val rest = pack(x2 :: tail)
      (x1 :: rest.head) :: rest.tail

    case x1 :: x2 :: tail if x1 != x2 =>
      List(x1) :: pack(x2 :: tail)

    case x :: Nil => List(List(x))

    case Nil => Nil
  }
}
