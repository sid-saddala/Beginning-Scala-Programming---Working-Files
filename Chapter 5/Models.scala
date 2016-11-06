import scala.beans.BeanProperty

class Employee(@BeanProperty val firstName:String,
               @BeanProperty val lastName:String,
               val title:String = "Programmer") extends Person {

    require(firstName.nonEmpty, "First Name cannot be empty")
    require(lastName.nonEmpty, "Last Name cannot be empty")
    require(title.nonEmpty, "Title cannot be empty")

    if (title.contains("Senior") || title.contains("Junior")) 
         throw new IllegalArgumentException("Title cannot contain Junior or Senior")

    //Atypical form with side effect without an equals
    //def this(firstName:String, lastName:String)  {this(firstName, lastName, "Programmer")
    //                                               println("Side Effect")}

    //Atypical Form without equals
    //def this(firstName:String, lastName:String) {this(firstName, lastName, "Programmer")}

    //Atypical form with side effect              
    //def this(firstName:String, lastName:String) = {this(firstName, lastName, "Programmer")
    //                                               println("Side Effect")}

    //Atypical Form
    //def this(firstName:String, lastName:String) = {this(firstName, lastName, "Programmer")}

    //Typical Form
    //def this(firstName:String, lastName:String) = this(firstName, lastName, "Programmer")

    def fullName = s"$firstName $lastName"

    def copy(firstName:String = this.firstName, lastName:String = this.lastName,
             title:String = this.title) = {
        new Employee(firstName, lastName, title)
    }
}

case class Department(name:String) 

class Manager(firstName:String, lastName:String, title:String, val department:Department) extends 
         Employee(firstName, lastName, title) {
     override def fullName = s"$firstName $lastName, ${department.name} Manager"

     def copy(firstName:String = this.firstName, lastName:String = this.lastName,
             title:String = this.title, department: Department = this.department) = {
        new Manager(firstName, lastName, title, department)
     }
}











