

package introduction

import java.util.Scanner

object EvalEx {

  def factorial(x: Int): Int = {
    x match {
      case 0 => 1
      case _ => x * factorial(x - 1)
    }
  }

  def main(args: Array[String]) {
    val sc = new Scanner(System.in)
    val n = sc.nextInt()
    for (i <- 1 to n) {
      val x = sc.nextDouble()
      val ex = 0.to(9).map { p => (Math.pow(x, p) / factorial(p)) }.sum
      println(ex)
    }
  }

}