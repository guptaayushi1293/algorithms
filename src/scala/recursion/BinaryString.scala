package recursion

object BinaryString {

  def BinaryString(n: Int, output: String) : Unit = {
    if (n < 1) println("output is : " + output) else {
      BinaryString(n - 1, "0" + output)
      BinaryString(n - 1, "1" + output)
    }
  }
}
