object Lists extends App {
  
  val a = List(1,2,3,4,5)
  val a2 = List.apply(1,2,3,4,5)
  val a3 = 1 :: 2 :: 3 :: 4 :: 5 :: Nil

  println(a.head) //1
  println(a.tail) //2,3,4,5
  println(a.init) //1,2,3,4
  println(a.last) //5

  println(a.apply(3)) //4
  println(a.min)
  println(a.max)
  println(a.isEmpty)
  println(a.nonEmpty)
  println(a.updated(3, 100)) //Underused

  println(a.mkString(","))
  println(a.mkString("**"))
  println(a.mkString("[", "**", "]"))
}
