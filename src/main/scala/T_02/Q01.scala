package T_02

object Q01 {
  def main(args:Array[String]){
    var (c, f, g, i, j, k, m, n) = ('X', 12.0f, 4.0f, 2, 2, 2, 5, 5)

    println(k+12*m)
    println(m/j)
    println(n%j)
    println(m/j*j)
    println(f+10*5+g)
    //println(++i*n) //  ++ is not a valid operator in Scala

    
    var (a:Int, b:Int, c2:Int, d:Int, k2:Float) = (2, 3, 4, 5, 4.3f) // c and k are already defined. They can't redeclare. We redeclared the value of c and k as c2 and k2
    //println(--b*a+c2*d--) -> a)

    // -- is an invalid operator in Scala
    // In JAVA it is valid. According to JAVA the answer should be 2*2+4*5-> 24.The value of b is 2.

    //println(a++) -> b)
    //++ is an invalid operator in Scala
    //In JAVA it is valid. According to the JAVA the answer should be 2. Now the value of a is 3.

    println(-2*(g-k2)+c2)

    //println(c2=c2++)
    //++ is an invalid operator in Scala
    // In JAVA the answer is 4

    //println(c2=++c2*a++) ---->d)
    //++ is an invalid operator in Scala
    //In JAVA the answer is 5*3-> 15
    //New value of a is 4

  }
}
