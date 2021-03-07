package recursion

object KAryString {

  def KAryString(n: Int, k: Int, output: String) : Unit = {
    if (n < 1) println("output is : " + output)
    else {
      for (i <- 0 until k) {
        KAryString(n - 1, k, i + output)
      }
    }
  }
}
