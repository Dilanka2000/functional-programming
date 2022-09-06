package T_06

object Q01 extends App{
  var key = 7
  var enText = ""
  var deText = ""

  def encrypt(text:String, k:Int=key):Unit = {
    var enResult = "";

    // traverse text
    for (i <- text) {
      // Encrypt Uppercase letters
      if (i.isUpper)
        enResult += (i.asInstanceOf[Int] + k).asInstanceOf[Char];

      // Encrypt Lowercase letters
      else
        enResult += (i.asInstanceOf[Int] + k).asInstanceOf[Char];
    }
    enText = enResult;

    // print the encrypting string
    print(enResult);
  }

  def decrypt(text:String=enText, k:Int=key):Unit = {
    var deResult = "";

    // traverse text
    for (i <- text) {
      // Decrypt Uppercase letters
      if (i.isUpper)
        deResult += (i.asInstanceOf[Int] - k).asInstanceOf[Char];

      // Decrypt Lowercase letters
      else
        deResult += (i.asInstanceOf[Int] - k).asInstanceOf[Char];
    }
    deText = deResult;

    // print the decrypting string
    print(deResult);
  }

  encrypt("aB@c567d");
  println(enText)

  decrypt()

}

