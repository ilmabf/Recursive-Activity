// Question 4
import scala.io.StdIn.readInt

object EvenOdd_Question4{

  def Even(n:Int): Boolean = n match{
    case 0 => true;
    case _ => Odd(n-1);
  }

  def Odd(n:Int) : Boolean = !(Even(n));

  def main(args:Array[String]){
    println("Enter a number");
    var value = readInt();
    var result = Even(value);

    if(result){
      println("Number is even");
    }
    else{
      println("Number is odd");
    }
  }
}
