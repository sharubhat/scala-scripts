#!/usr/bin/env scala

/* Like map, flatMap walks through every element in a collection and applies a given function, 
   saving the value for later use.  However, unlike map, flatMap expects the return type of the specified function to be 
   the same as the enclosing collection with an optionally different type parameter. 

   In below example, map would've resulted in a value for each element of original list say value 1, value 2 etc.
   Final list would've been List(value1, value2, value3)

   Using flatMap on List results in a new List for each element of original list. 
   i.e. List(v1, v2), List(v3, v4), List(v5) etc. Note that these Lists need not be of same size.
   Finally flattening happens resulting in a new List(v1, v2, v3, v4, v5)
*/

val strs = List("2", "scala", "2", "four", "five", "6")
val nums = strs.flatMap{
	s => try {
		List(s.toInt)
	} catch {
		case _ : Throwable => Nil
	}
}

nums.foreach(println)