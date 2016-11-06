object Functions extends App {
   val f1 = (x:Int) => x + 1
   
   val f0 = () => 1

   val f2 = (x:Int, y:String) => y + x

   println(f1(3))
   println(f0())
   println(f2(3, "Wow"))

   val f3 = (x:String) => (x, x.size)
   println(f3("Laser"))
}
