package T_05

object Q05 extends App{

  def additionEven(n:Int):Int={
    n match{
      case x if(x<=0) => 0
      case x if(x==2) => 2
      case x if(x%2 != 0) => additionEven(n-1)
      case _ => n + additionEven(n-2)
    }
  }

  printf("Enter the Number : ");
  var num = scala.io.StdIn.readInt();
  println(additionEven(num))
}
