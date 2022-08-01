package T_03

object Q04 {
  def booksPrice(x:Int):Double = x*24.95;
  def discount(x:Int):Double = booksPrice(x)*0.4;
  def shippingCoust(x:Int):Double = {
    if (x<50){
      x*3;
    }
    else{
      150+(x-50)*0.75;
    }
  }

  def main(args: Array[String]) {
    val totalCoust = booksPrice(60) - discount(60) + shippingCoust(60);
    print("Total wholesale cost is = " + totalCoust);
  }
}
