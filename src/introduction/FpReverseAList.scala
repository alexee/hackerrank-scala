

package introduction

object FpReverseAList extends App {

  def f(arr: List[Int]): List[Int] = {
    if (arr.isEmpty) {
      List.empty[Int]
    } else {
      f(arr.drop(1)) ::: List(arr(0))
    }
  }

}