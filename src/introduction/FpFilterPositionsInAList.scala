

package introduction

object FpFilterPositionsInAList {
  
  def f(arr:List[Int]) : List[Int] = {
    if (arr.length < 2) {
      List.empty[Int]
    } else {
      arr(1) :: f(arr.drop(2))
    }
  }
  
  def main(args: Array[String]) {
    println(f(List(1,2,3,4,5,6,7)))
  }
}