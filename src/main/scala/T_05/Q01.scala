package T_05

object Q01 extends App{
  def prime(n:Int, i:Int=2):Boolean={
    n match{
      case x if(x == 2) => true
      case x if(x < 2) => false
      case x if(x%i == 0) => false
      case x if(i*i > x) => true
      case _ => prime(n,i+1)
    }
  }

  println(prime(5))
  println(prime(8))
}
