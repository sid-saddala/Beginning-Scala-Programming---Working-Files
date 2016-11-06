object MyObject {
   def foo(x:Int, y:Int) = x + y
}

println(MyObject.foo(5, 10))

class Employee(val firstName:String, val lastName:String, val title:String)

object Knuth extends Employee("Donald", "Knuth", "Programmer")
println(Knuth.firstName)
println(Knuth.lastName)
println(Knuth.title)
