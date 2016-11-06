def processNumbers(b:Boolean = true, x:Int, y:Int) = if (b) x else y

println(processNumbers(x = 10, y = 41, b = true)) //10

def add(x:Int, y:Int = 10) = x + y
println(add(4,3)) //4
println(add(30))

println(processNumbers(x = 4, y = 5))
