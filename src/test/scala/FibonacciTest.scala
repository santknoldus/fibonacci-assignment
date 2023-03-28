package kup.knoldus.fibonacci

import org.scalatest.TryValues._
import org.scalatest.funsuite.AnyFunSuite

class FibonacciTest extends AnyFunSuite {

  val fibonacci = new Fibonacci

  test("if given position is 10") {
    val result = fibonacci.generateFibonacci(10).success.value
    val expectedOutput = 55
    assert(result === expectedOutput)
  }

  test("if given position is -1") {
    assert(fibonacci.generateFibonacci(-1).isFailure)
  }
}