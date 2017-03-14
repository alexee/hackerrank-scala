

package introduction

object FpListReplication {

  def f(num: Int, arr: List[Int]): List[Int] = {
    val ret = if (arr.isEmpty)
                List.empty[Int]
              else 
                repeatNTimes(arr(0), num) ::: f(num, arr.drop(1))
    ret
  }

  def repeatNTimes(item: Int, n: Int): List[Int] = {
    val ret = if (n == 0) List.empty[Int] else item :: repeatNTimes(item, n - 1)
    ret
  }

  def main(args: Array[String]) {
    val ret = f(5, List(1, 2, 3))
    ret.foreach { x => println(x) }
  }

}