package T_07

object Q01_Q02 extends App{

  var r1 = new Rational(3,4)
  val r2 = new Rational(5,8)
  val r3 = new Rational(2,7)
  var x = r1.neg
  var addition = r1 - r2 - r3

  println("Answer is : " +x)
  println("Addition is : " +addition)
}

class Rational(n:Int, d:Int) {
  require(d>0,"Denominator Must greater than 0")
  def numerator = n
  def denomerator = d

  def add(r:Rational) = new Rational(this.numerator*r.denomerator+this.denomerator*r.numerator,this.denomerator*r.denomerator)
  def neg = new Rational(-this.numerator,this.denomerator)
  def -(r:Rational) = this.add(r.neg)
  override def toString = numerator + "/" + denomerator
}
