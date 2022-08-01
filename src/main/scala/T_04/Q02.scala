package T_04

object Q02 {
  def checkingInput(x:Int):Unit = {
    x match{
      case x if x == 0 => printf("Zero");
      case x if x < 0 => printf("Negative");
      case x if x > 0 => isEvenOrOdd(x);
    }
  }

  def isEvenOrOdd(i:Int):Unit = {
    i%2 == 0 match {
      case true => printf("Even");
      case false => printf("Odd");
    }
  }

  def main(args:Array[String]){
    printf("Enter the integer : ");
    var integer = scala.io.StdIn.readInt();
    checkingInput(integer);
    return 0;
  }
}
