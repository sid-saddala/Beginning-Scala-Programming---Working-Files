class Employee(val firstName:String, val middleName: Option[String], val lastName:String) {
   def this(firstName:String, middleName:String, lastName:String) = 
           this(firstName, Some(middleName), lastName)
   def this(firstName:String, lastName:String) = 
           this(firstName, None, lastName)
   def this() = this("Unknown", "Unknown")
}

object Options extends App {
   val middleName = Some("Antony")
   val middleName2:Option[String] = middleName
   val middleName3:Some[String] = middleName

   val noMiddleName = None
   val noMiddleName2:Option[String] = noMiddleName
   val noMiddleName3:Option[Nothing] = noMiddleName
   val noMiddleName4:None.type = noMiddleName

   val carHoare = new Employee("Charles", "Antony", "Hoare")
   val bjarne = new Employee("Bjarne", "Stroustrup")
   val strangePerson = new Employee

   println(middleName.getOrElse("No middle name"))
   println(noMiddleName.getOrElse("No middle name"))
   println(carHoare.middleName.getOrElse("No middle name"))
   println(bjarne.middleName.getOrElse("No middle name"))
   println(strangePerson.middleName.getOrElse("No middle name"))

   def peelTheMiddleName(x:Option[String]):String = {
      x match {
         case Some(name) => name
         case None => "No middle name"
      }
   }
   
   println(peelTheMiddleName(carHoare.middleName))
   println(peelTheMiddleName(bjarne.middleName))
   println(peelTheMiddleName(strangePerson.middleName))
}







