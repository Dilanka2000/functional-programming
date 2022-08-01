package T_04

object Q03 {
  def toUpper(text: String): String = {
    text.toUpperCase();
  }

  def toLower(text: String): String = {
    text.toLowerCase();
  }

  def formatNames(name: String)(fun: String => String): String = {
    fun(name);
  }

  def main(args: Array[String]): Unit = {

    println(formatNames("Benny")(toUpper(_)));

    val text1="Niroshan";
    val text2= text1.substring(0,2);
    println(formatNames(text2)(toUpper(_))+"roshan");

    println(formatNames("Saman")(toLower(_)));

    val text3="Kumara";
    val text4=text3.substring(5);
    println("Kumar"+formatNames(text4)(toUpper(_)));
  }

}
