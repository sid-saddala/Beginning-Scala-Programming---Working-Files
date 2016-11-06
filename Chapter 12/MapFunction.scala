object MapFunction extends App {
  val a = List(1,2,3,4,5,6)
  val f = (x:Int) => x + 1
  println(a.map(f))
  println(a.map((x:Int) => x + 1))
  println(a.map(x => x + 1))
  println(a.map(_ + 1))
  println(a.map(1 + _))
  import scala.language.postfixOps
  println(a.map(1+))

  val b = Set("Brown", "Red", "Green", "Purple", "Gray", "Yellow")
  println(b.map(x => x.size))
  println(b.map(_.size))
  println(b.map(x => (x, x.size)))

  val fifaMensChamps = Map('Germany -> 4, 'Brazil -> 5, 'Italy -> 4, 'Argentina -> 2)
  println(fifaMensChamps.map(t => (Symbol.apply("Team " + t._1.name),t._2)))

  println("Hello!".map(c => (c + 1).toChar))
  println(Some(4).map(1+))
  println(None.asInstanceOf[Option[Int]].map(1+))

  val age:Option[Int] = None
  println(age.map(1+))

}
