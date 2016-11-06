val coupleIntString = new Couple(10, "Scala") //Couple[Int, String]
val coupleIntString2:Couple[Int, String] = Couple(10, "Scala") //Couple[Int, String]
val coupleStringString = Couple("One", "Two") //Couple[String, String]
val coupleDoubleInt = Couple(30.123, 3) //Couple[Double, Int]
val coupleStringCoupleIntDouble = Couple("Hello", Couple(3, 22.2)) //Couple[String, Couple[Int, Double]]

println(coupleStringCoupleIntDouble.second.second)

val employeeCouple = Couple(new Employee("John", "McCarthy"), new Employee("Guido", "van Rossum"))
println(employeeCouple)
println(employeeCouple.swap)
