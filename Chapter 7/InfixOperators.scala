class Foo(x:Int) {
  def bar(y:Int) = x + y
  def baz(a:Int, b:Int) = x + a + b
  def qux(y:Int) = new Foo(x + y)
}

object InfixOperatorsRunner extends App {
  val foo = new Foo(10)
  println(foo.bar(5))
  println(foo bar 5)
  println(foo.baz(10, 14))
  println(foo baz (10, 14))
  println(3 + 10)
  println(3.+(10))
  println(foo bar 4 + 19) //33
  println(foo qux 4 qux 10 qux 19 qux (100 + 19) bar 40 + 300)
}
