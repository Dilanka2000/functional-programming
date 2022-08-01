package T_04

object Q01 {
  def amountOfInterest(x:Double):Double = {
    x match {
      case x if x < 0 => 0;
      case x if x < 20000 => x*0.02;
      case x if x < 200000 => x*0.04;
      case x if x < 2000000 => x*0.035;
      case x if x > 2000000 => x*0.065;
    }
  }

  def main(args:Array[String]){
    printf("Enter the amount of deposit : ");
    var deposit = scala.io.StdIn.readDouble();
    printf("Amount of interest that the money earns in a year = %.2f", amountOfInterest(deposit));
    return 0;
  }
}
