#!/usr/bin/env scala

println("""	
For each iteration of your for loop, yield generates a value which will be remembered. 
It's like the for loop has a buffer you can't see, and for each iteration of your for loop, 
another item is added to that buffer. When your for loop finishes running, 
it will return this collection of all the yielded values. 
The type of the collection that is returned is the same type that you were iterating over, 
so a Map yields a Map, a List yields a List, and so on.

Also, note that the initial collection is not changed; 
the for/yield construct creates a new collection according to the algorithm you specify.""")

println()

println("For 1 to 5, create a Vector with f applied to it")
val a = for(i <- 0 to 5) yield i * 2
println(a)

println()

println("For a list, create a list with f applied to it")
val mylist = List(1,2,3,4,5)
val b = for(i <- mylist) yield i
println(b)

println()

println("For a list, create a list with f applied to it with some guard conditions")
val c = Array(1,2,3,4,5)
val d = for(i <- c if i > 2) yield i * 2
d.foreach(println)