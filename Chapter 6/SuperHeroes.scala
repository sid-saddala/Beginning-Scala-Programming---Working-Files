class Person(val name:String, private val superheroName:String)

object Person {
  def showMeInnerSecret(x:Person) = x.superheroName
}

object SuperHeroRunner extends App {
  val clark = new Person("Clark Kent", "Superman")
  println(Person.showMeInnerSecret(clark))
}
