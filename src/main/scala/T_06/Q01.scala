package T_06

object Q01 extends App{
  var key = 7
  var enText = ""
  var deText = ""

  def encrypt(text:String, k:Int=key):Unit = {
    var enResult = "";

    // traverse text
    for (i <- text) {
      // Encrypt letters
      enResult += (i.asInstanceOf[Int] + k).asInstanceOf[Char];
    }
    enText = enResult;

    // print the encrypting string
    println("Encryption value is : " + enResult);
  }

  def decrypt(text:String=enText, k:Int=key):Unit = {
    var deResult = "";

    // traverse text
    for (i <- text) {
      // Decrypt letters
      deResult += (i.asInstanceOf[Int] - k).asInstanceOf[Char];
    }
    deText = deResult;

    // print the decrypting string
    println("Decryption value is : " + deResult);
  }

  encrypt("aB@c567d");

  decrypt()

}

