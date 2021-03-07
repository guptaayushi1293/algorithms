package recursion

import scala.annotation.tailrec

object SortedArray {

  @tailrec
  def SortedArray(n: Array[Int], last: Int) : Boolean = {
    if (n.isEmpty || last == 0) {
      println("End of array .. ")
      true
    }
    else if (n(last) >= n(last - 1)) {
      println("Two numbers : " + n(last) + " and " + n(last - 1))
      SortedArray(n, last - 1)
    }
    else false
  }
}
