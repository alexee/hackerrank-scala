

package introduction

object FpHelloWorld {
  
  def f(n: Int) = {
    1.to(n).foreach { _  => println("Hello World") }
  }
  
   def main(args: Array[String]) {
     f(5);
   }
  
  
}