import scala.annotation.tailrec

def factorial(n:Int) = {
  @tailrec
  def fact(n:BigInt, acc:BigInt):BigInt = {
    if (n == 0 || n == 1) acc
    else fact(n - 1, acc * n)
  }

  fact(n, 1)
}

println(factorial(5))
println(factorial(100))
println(factorial(1000))
println(factorial(10000))
