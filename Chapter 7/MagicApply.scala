class Foo(x:Int) {
   def apply(y:Int) = x + y
}


object MagicApply extends App {
  val foo = new Foo(10)
  println(foo.apply(20)) 
  println(foo(20)) 
}
