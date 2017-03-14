

package introduction

object FpUpdateList {
  
  def f(arr: List[Int]):List[Int] = {
    arr.map { x => Math.abs(x) }
  }
  
}