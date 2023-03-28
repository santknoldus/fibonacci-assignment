package kup.knoldus.fibonacci

import scala.annotation.tailrec
import scala.util.Try

class Fibonacci {

  def generateFibonacci(position: Int): Try[Int] = Try {
    @tailrec
    def helper(previous: Int, current: Int, limit: Int): Int = {
      if (limit == 0)
        previous
      else helper(current, current + previous, limit - 1)
    }

    if (position < 0) throw new IllegalArgumentException("Invalid Input")
    else helper(0, 1, position)
  }
}