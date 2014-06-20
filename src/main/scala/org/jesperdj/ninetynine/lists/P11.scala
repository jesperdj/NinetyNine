package org.jesperdj.ninetynine.lists

object P11 {
  import P10._

  def encodeModified[T](xs: List[T]): List[Any] = encode(xs) map {
    case (1, x) => x
    case e => e
  }
}
