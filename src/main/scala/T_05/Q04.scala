package T_05

object Q04 extends App{

  def isEven(n: Int): Boolean = {
    n match {
      case x if(x == 0) => true
      case x if(x == 1) => false
      case _ => isEven(n-2)
    }
  }

  printf("Enter the Number : ");
  var num = scala.io.StdIn.readInt();

  println(if(isEven(num)) "EVEN" else "ODD")
}
