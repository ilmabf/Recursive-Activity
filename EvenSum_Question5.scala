// Question 5

import scala.io.StdIn.readInt

object EvenSum_Question5{

  def Even(n:Int): Boolean = n match{
    case 0 => true;
    case _ => Odd(n-1);
  }

  def Odd(n:Int) : Boolean = !(Even(n));

  def evenSum(n:Int) : Int = {
    if(n<1){
      return 0;
    }
    else if(Even(n-1)){
      return (n-1 + evenSum(n-1));
    }
    else return evenSum(n-1);
  }


  def main(args:Array[String]){
    println("Enter number");

    var value = readInt();

    var result = evenSum(value);
    println("Sum of even numbers less than " + value + " = " + result);
  }
}
