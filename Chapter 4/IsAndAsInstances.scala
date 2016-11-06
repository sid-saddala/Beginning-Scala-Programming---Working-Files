val g:Any = "Ice, ice, Call me Maybe"
val h:String = g.asInstanceOf[String]

def decide(x:Any) = if (x.isInstanceOf[Int]) x.asInstanceOf[Int] + 1 else -1

println(decide(4)) //5
println(decide("Hello!")) //-1

def decidePoorly(x:Any) = x.asInstanceOf[Int] + 10
println(decidePoorly(4))
println(decidePoorly("Zing!"))

