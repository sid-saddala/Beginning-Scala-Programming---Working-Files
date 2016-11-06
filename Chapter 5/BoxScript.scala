val intBox = new Box(1) //Box[Int]
val intBox2:Box[Int] = Box(1) //Box[Int]
val intBox3 = Box(1):Box[Int] //Coercion Box[Int]
val intResult:Int = intBox3.t

val stringBox = new Box("Hello") //Box[String]
val stringBoxExplicit = Box[String]("Hello") //Box[String]
val managerBox = Box[Employee](new Manager("Kathy", "Sierra", "Programmer", 
                     Department("Programming Learning and Fun"))) //Box[Employee]

val doubleBoxBox = Box(Box(4.0)) //Box[Box[Double]]
val doubleResult:Double = doubleBoxBox.t.t
println(doubleResult)

val intBox4 = Box(200)
val coupleIntStringBox:Box[Couple[Int,String]] = intBox4.coupleWith("Scala")
println(coupleIntStringBox.t.first)
println(coupleIntStringBox.t.second)
