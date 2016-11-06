object FlatMap extends App {
   val a = List(1,2,3,4,5)
   println(a.map(x => List(-x, 0, x)))
   println(a.map(x => List(-x, 0, x)).flatten)
   println(a.flatMap(x => List(-x, 0, x)))

   val b:List[List[List[Int]]] = List(List(List(1,2,3), List(4,5,6)),
                                 List(List(7,8,9), List(10,11,12)))

   println(b.flatMap(c => c).flatMap(c => c).flatMap(c => List(-c, c)))

   println(Set(2,4,10,11).flatMap(x => Set(x, x * 5)))

   val origMap = Map(1 -> "One", 2 -> "Two", 3 -> "Three")

   println(origMap.flatMap(t => Map(t._1 -> t._2, (t._1 * 100) -> (t._2 + " Hundred"))))

   println(Some(4).flatMap(x => Some(x + 19)))

   println(None.asInstanceOf[Option[Int]].flatMap(x => Some(x + 19)))

   println(Some(10).flatMap(x => None))

   println(List(Some(4), None, Some(5), None, None, Some(10)).flatMap(x => x))


}
