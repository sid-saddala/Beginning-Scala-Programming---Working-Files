import java.time._
class Employee protected (val firstName:String, val lastName:String, val title:String, val hireDate:LocalDate)

object Employee {
    def create(firstName:String, lastName:String, title:String) = 
       new Employee(firstName, lastName, title, LocalDate.now)

    def create(firstName:String, lastName:String, title:String, hireDate:LocalDate) = 
       new Employee(firstName, lastName, title, hireDate)
}

object EmployeeDesignRunner extends App {
  val employee = Employee.create("Ken", "Thompson", "Programmer")
  println(employee.hireDate)
}
