// Question 3

import scala.io.StdIn.readInt

object Sum_Question3{

  def sum(n:Int) : Int = {
    if(n==0){
      return 0;
    }
    return n+ sum(n-1);
  }
  def main(args:Array[String]){
    println("Enter a number");
    var value = readInt();

    var result = sum(value);

    println("Addition of numbers upto " + value + " = " + result);
  }
}
