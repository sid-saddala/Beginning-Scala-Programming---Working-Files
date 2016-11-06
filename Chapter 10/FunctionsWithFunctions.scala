object FunctionsWithFunctions extends App {
  val f = (x:Int, y:Int => Int) => y(x)
  import scala.language.postfixOps
  println(f(3, 1+))

  val g = (x:Int) => (y:Int) => x + y
  println(g(4)(5))
  println(g.apply(4).apply(5))
}
