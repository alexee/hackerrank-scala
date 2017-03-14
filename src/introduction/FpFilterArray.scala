

package introduction

object FpFilterArray {
  
  def f(delim: Int, arr: List[Int]): List[Int] = {
    if (arr.isEmpty)
      List.empty[Int]
    else
      if (arr(0) < delim) 
        arr(0) :: f(delim, arr.drop(1)) 
      else
        f(delim, arr.drop(1))
  }
  
  def main(args: Array[String]) {
    println(f(3, List(1,2,3,5,6)))
  }
  
}