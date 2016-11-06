object Maps extends App {
   val m = Map.apply((1, "One"), (2, "Two"), (3, "Three"))
   val m2 = Map((1, "One"), (2, "Two"), (3, "Three"))

   val t:(Int, String) = 3 -> "Three"
   println(t)

   val m3 = Map(1 -> "One", 2 -> "Two", 3 -> "Three")

   println(m3.get(1)) //Some("One")
   println(m3.apply(1)) //"One"
   println(m3(1)) //"One"
   println(m3.get(4)) //None
   //println(m3(4)) //Error
   
   println(m3.toList)
   println(m3.keys) //Set
   println(m3.keySet) //Set
   println(m3.values.toList) //Set

   val s = new String("Co")
   val s2 = "Co" //interned
   println(s == s2) //true
   println(s eq s2) //false

   val co = Symbol("Co")
   val co2 = 'Co
   println(co == co2) //true
   println(co eq co2) //true

   val elements:Map[Symbol, String] = Map('Co -> "Cobalt", 'H -> "Helium", 'Pb -> "Lead")
   println(elements.get('Co))
}







