

package introduction

object FpArrayOfNElements extends App {

  def f(num: Int): List[Int] = {
    if (num == 0) List.empty[Int]
    else 1 :: f(num - 1)
  }

  println(f(readInt))
}