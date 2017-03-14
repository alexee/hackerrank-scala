

package introduction

object FpListLength extends App {
  
  def f(arr: List[Int]):Int = {
    if (arr.isEmpty)
      0
    else
      1 + f(arr.drop(1))
  }
  
}