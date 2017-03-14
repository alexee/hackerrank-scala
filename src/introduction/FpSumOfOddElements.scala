

package introduction

object FpSumOfOddElements extends App {

  def f(arr: List[Int]): Int = {
    arr.filter { _ % 2 != 0 }.reduceLeft(_ + _);
  }

}