object Ranges extends App {

  var r = 1 to 10 //include 10
  val r2 = 1 until 10 //exclude 10
  println(r)
  println(r2)
  println(r2.head)
  println(r2.tail)

  val r3 = 2 to 10 by 2
  println(r3)
  val r4 = 10 to 2 by -2
  println(r4)

  val r5 = ('a' to 'z') ++ ('A' to 'Z')
  println(r5)

  val r6 = Range(1,10)
  println(r6)

  val r7 = Range(1,10,2)
  println(r7)

  val r8 = Range.inclusive(1, 10)
  println(r8)

  val r9 = Range.inclusive(2, 10, 2)
  println(r9)

  for (i <- 1 to 10) println(i + 1)
 
  println("----")
  for (i <- 2 to 10 by 2) println(i + 1)
}











