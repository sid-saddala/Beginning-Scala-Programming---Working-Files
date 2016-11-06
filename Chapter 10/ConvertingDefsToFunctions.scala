class Foo(x:Int) {
   def bar(y:Int) = x + y
   def gym(z:Int, a:Int) = x + z + a
}

class Baz(z:Int) {
   def qux(f:Int => Int) = f(z)
   def jam(f:(Int, Int) => Int) = f(z, 10)
}

object ConvertingDefsToFunctions extends App {
   val x = new Foo(10)
   val f = x.bar _
   println(f.apply(20))
   println(f(20))

   val z = new Baz(20)
   println(z.qux(f)) //30

   println(z.qux(x.bar _)) //30
   println(z.qux(x.bar)) //30

   val f2 = x.gym(40, _:Int)
   println(z.qux(f2))

   println(z.jam(x.gym))
}

