
//Question 1

import scala.io.StdIn.readInt

object isprime_Question1{
  var i = 0;
  def main(args: Array[String]){
    println("Enter number to check if it is a prime");
    var value = readInt();
    i = value/2;

    val result = prime(value);
    if(result){
      println("Value is a prime");
    }
    else{
      println("Value is not a prime");
    }
  }

  def prime(n:Int) : Boolean ={
    if(i==1){
      return true;
    }
    else if(n % i == 0){
      return false;
    }
    else{
      i = i-1;
      prime(n);
    }
  }
}
