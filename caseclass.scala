#!/usr/bin/env scala

/*
  Ref: http://www.codecommit.com/blog/scala/case-classes-are-cool

  Case classes: what they are and how to use them?

  Syntactically, case classes are standard classes with a special modifier: case.  
  This modifier signals the compiler to assume certain things about the class and to define certain boiler-plate based on those assumptions.  
  Specifically:

  . Constructor parameters become public “fields” (Scala-style, which means that they really just have an associated accessor/mutator method pair)
  . Methods toString(), equals() and hashCode() are defined based on the constructor fields
  . A companion object containing:
  . An apply() constructor based on the class constructor
  . An extractor based on constructor fields
*/

case class Person(firstName: String, lastName: String)
 
val me = Person("Daniel", "Spiewak")
val first = me.firstName
val last = me.lastName
 
if (me == Person(first, last)) {
  println("Found myself!")
  println(me)
}

class Human(val firstName: String, val lastName: String) {
	// Note that it's necessary to override toString
	override def toString = firstName + " " + lastName
}

val meH = new Human("Daniel", "Spiewak")
val firstH = meH.firstName
val lastH = meH.lastName

if(meH == new Human(firstH, lastH)) {
	println("Found myself Human!")
	println(meH)
}
else {
	println("Found myself different!")
	println(meH)
}
