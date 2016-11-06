def decide[T](b:Boolean, x:T, y:T):T = if (b) x else y

println(decide(true, "A", "B"))
println(decide(false, 3, 10))
println(decide(true, 'c', 'd'))

def getNextChar(c:Char) = (c + 1).toChar
println(getNextChar(decide(true, 'c', 'd')))

//val result = decide(true, 'c', 'd')
//if (result.isInstanceOf[Char]) {
//  val charResult = result.asInstanceOf[Char]
//  println(getNextChar(charResult))
//}
