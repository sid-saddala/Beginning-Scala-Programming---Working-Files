val ada = new Employee("Ada", "Lovelace")
println(ada.firstName)

val newAda = ada.copy(lastName = "Byron, Countess of Lovelace")
println(newAda.lastName)

println(newAda.title)

val dennis = new Employee(lastName="Ritchie", firstName="Dennis")
println(s"The first name is ${dennis.firstName}")
println(s"The last name is ${dennis.lastName}")

println(ada.fullName)
println(newAda.fullName)
println(dennis.fullName)

try {
  new Employee("Bono", "", "Singer")
} catch {
  case iae:IllegalArgumentException => println(iae.getMessage)
} finally {
  println("Continuing with our program")
}

try {
  new Employee("Linus", "Torvalds", "Senior C Programmer")
} catch {
  case iae:IllegalArgumentException => println(iae.getMessage)
} finally {
  println("Continuing with our program")
}

val mathematics = new Department("Mathematics")
val alan:Manager = new Manager("Alan", "Turing", "Mathematician, Logician", mathematics)
println(alan.department.name)

val alanEmployee:Employee = alan

println(ada.firstName)
println(newAda.firstName)
println(dennis.firstName)
println(alan.firstName)
println(alanEmployee.firstName)

//println(alanEmployee.department.name)

def extractFirstName(e:Employee) = e.firstName

println(extractFirstName(ada))
println(extractFirstName(dennis))
println(extractFirstName(alan))

println(ada.fullName)
println(newAda.fullName)
println(dennis.fullName)
println(alan.fullName)
println(alanEmployee.fullName)

val alanNewJob = alan.copy(title="Supreme Encryption Specialist")
println(alanNewJob.title)


















