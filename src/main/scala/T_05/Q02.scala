package T_05

object Q02 extends App{

  def prime(n:Int, i:Int=2):Boolean={
    n match{
      case x if(x == 2) => true
      case x if(x < 2) => false
      case x if(x%i == 0) => false
      case x if(i*2 > x) => true
      case _ => prime(n,i+1)
    }
  }

  def primeSeq(n:Int):Unit = {
    if(n>2){
      for(i <- 2 to n-1){
        if(prime(i)){
          print(i+" ")
        }
      }
    }
    else{
      printf("No prime numbers")
    }
  }

  primeSeq(10)
}
