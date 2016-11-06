object ByNameParameters extends App {
  def byValue(x:Int)(y:Int) = { println("By Value:"); x + y }

  def byFunction(x:Int)(y: () => Int) = { println("By Function:"); x + y() }

  def byName(x:Int)(y: => Int) = { println("By Name:"); x + y }

  val a = byValue(3){
             println("In call") 
             19
          }
  
  val b = byFunction(3)(() => {println("In call"); 19})

  val c = byName(3){
             println("In call")
             19
          }

  def divideSafely(f: => Int):Option[Int] = {
     try {
         Some(f)
     } catch {
         case ae:ArithmeticException => None
     }
  }

  val d = divideSafely {
     val x = 10
     val y = 5
     x / y
  }

  println(d)

  val e = divideSafely {
     val x = 1000
     val y = 0
     x / y
  }

  println(e)

}













