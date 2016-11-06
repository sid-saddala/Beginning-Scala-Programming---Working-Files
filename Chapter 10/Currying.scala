object Currying extends App {
   val g = (x:Int) => (y:Int) => x + y
   val f = (x:Int, y:Int) => x + y
   val fc = f.curried //fc and g are the same function
   val f2 = Function.uncurried(fc)
   println(f2(4, 5))
}
