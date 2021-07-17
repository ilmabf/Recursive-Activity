// Question 6
import scala.io.StdIn.readInt

object Fibonacci_Question6{

  def fibonacci(n:Int): Int ={
      if(n <= 0){
        return 0;
      }
      if(n == 1 || n == 2){
        return 1;
      }
      else{
        return (fibonacci(n-1)+ fibonacci(n-2));
      }
  }

  def printFib(n:Int, i:Int){
    if(i == n){
      println("----");
    }
    else{
      println(fibonacci(i));
      return printFib(n,i+1);
    }
  }
  def main(args:Array[String]){
    println("Enter a number");
    var value = readInt();
    println("First " + value + " Fibonacci numbers : ");
    printFib(value, 0);
  }
}
