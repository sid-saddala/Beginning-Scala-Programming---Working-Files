object MyObject {
   val f = (x:Int) => x + 1
   def g(x:Int) = x + 1
}

object MethodOrFunction extends App {
   println(MyObject.f.apply(4))
   println(MyObject.f(4))
   println(MyObject.g(4))
}
