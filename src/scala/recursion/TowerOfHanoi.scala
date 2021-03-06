package recursion

object TowerOfHanoi {
  def TowerOfHanoi(n: Int, from: String, to: String, aux: String): Unit = {
    if(n == 1) {
      println("Move disk : " + n + " from " + from + " to " + to)
    } else {
      TowerOfHanoi(n-1, from, aux, to)
      println("Move disk : " + n + " from " + from + " to " + to)
      TowerOfHanoi(n-1, aux, to, from)
    }
  }
}

/**
 * Run functions in app
 * TowerOfHanoi.TowerOfHanoi(2, "A", "C", "B")
 * TowerOfHanoi.TowerOfHanoi(3, "A", "C", "B")
 */
