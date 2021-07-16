
//Question 2

import scala.io.StdIn.readInt

object primeSequence_Question2{
  var i = 0;
  def main(args: Array[String]){
    println("Enter number");
    var value = readInt();
    i = value/2;
    primeSeq(value);
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


  def primeSeq(n:Int){
    if(n <= 1){
      println("---");
    }
    if(n>1){
      var result = prime(n);
      if(result){
        println(n);
      }
      i = (n-1)/2;
      primeSeq(n-1);
    }
  }
}
