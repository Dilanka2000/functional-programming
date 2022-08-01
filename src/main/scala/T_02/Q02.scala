package T_02

object Q02 {
  def main(args:Array[String]): Unit ={
    //  4.a
    printf("Salary= Rs: %.4f\n",TakeSalary(40,30))

    //  4.b
    printf("Your Profit= %d\n",Profit(10))
    printf("Your Profit= %d\n",Profit(15))
    printf("Your Profit= %d\n",Profit(20))
  }

  // 4 a)
  def wageNormal(h1:Int)=250*h1
  def OTHours(h2:Int)=85*h2
  def IncomeSalary(h1:Int,h2:Int)=wageNormal(h1)+OTHours(h2)
  def Tax(Income:Double)=0.12*Income

  def TakeSalary(h1:Int,h2:Int): Double ={
    IncomeSalary(h1,h2)-Tax(IncomeSalary(h1:Int,h2:Int))
  }

  // 4 b)

  def atendees(price:Int)=120+(15-price)/5*20
  def Income(price:Int)=atendees(price)*price
  def CostTotal(price:Int)=atendees(price)*3+500

  def Profit(price:Int):Int={
    Income(price)-CostTotal(price)
  }

}
