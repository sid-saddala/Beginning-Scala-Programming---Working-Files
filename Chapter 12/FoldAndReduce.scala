object FoldAndReduce extends App {
  val foldLeftResult = (1 to 10).foldLeft(0){(total:Int, next:Int) => 
      println(s"Total: $total, Next: $next")
      total + next}
  println(foldLeftResult)

  println("----")

  val reduceLeftResult = (1 to 10).reduceLeft{(total:Int, next:Int) => 
      println(s"Total: $total, Next: $next")
      total + next}
  println(reduceLeftResult)

  println("----")
  
  val foldRightResult = (1 to 10).foldRight(0){(next:Int, total:Int) => 
      println(s"Total: $total, Next: $next")
      total + next}
  println(foldRightResult)

  println("----")

  val reduceRightResult = (1 to 10).reduceRight{(next:Int, total:Int) => 
      println(s"Total: $total, Next: $next")
      total + next}
  println(reduceRightResult)

  println((1 to 10).sum)
  println((1 to 10).product)
  println((1 to 10).foldLeft(0)(_ + _))
  println((1 to 10).mkString(","))
}
