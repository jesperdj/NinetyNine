package org.jesperdj.ninetynine.lists

object P08 {

  def compress[T](xs: List[T]): List[T] = xs match {
    case x1 :: x2 :: tail if x1 == x2 => compress(x2 :: tail)
    case x1 :: x2 :: tail if x1 != x2 => x1 :: compress(x2 :: tail)
    case _ :: Nil => xs
    case Nil => Nil
  }
}
