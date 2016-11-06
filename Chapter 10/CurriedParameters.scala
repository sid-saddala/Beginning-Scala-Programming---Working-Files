object CurriedParameters extends App {
   def foo(x:Int, y:Int, z:Int) = x + y + z
   def bar(x:Int)(y:Int)(z:Int) = x + y + z
   def baz(x:Int, y:Int)(z:Int) = x + y + z

   val f = foo(5, _:Int, _:Int)
   val g = bar(5) _
   
   println(f(4, 3))
   println(g(10)(19))
   println(g.apply(10).apply(19))
}
