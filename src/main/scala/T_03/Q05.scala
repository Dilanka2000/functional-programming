package T_03

object Q05 {
  def easy(x:Int):Int = x*8;
  def tempo(x:Int):Int = x*7;

  def main(args: Array[String]) {
    val total = easy(2) + tempo(3) + easy(2);
    print("Total running time is = " + total);
  }
}
