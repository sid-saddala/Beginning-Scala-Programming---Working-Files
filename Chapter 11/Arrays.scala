object Arrays extends App {
   val a:Array[Int] = Array(1,2,3,4) //int[]

   println(a.head)
   println(a.tail)
   println(a.init)
   println(a.last)
   println(a.apply(2))
   println(a.max)
   println(a.isEmpty)

   def repeatedParameterMethod(x:Int, y:String, z:Any*) = {
       println(z) //WrappedArray
       "%d %ss give you %s".format(x, y, z.mkString(", "))
   }

   println(repeatedParameterMethod(3, "egg", "a delicious sandwich", "protein", "high cholesterol"))
   println(repeatedParameterMethod(3, "egg", List("a delicious sandwich", "protein", "high cholesterol"):_*))


}
