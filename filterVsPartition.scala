#!/usr/bin/env scala

val a = List(1,2,3,4,5,6)

println("Filtering a list gives a new List " + a.filter(_ % 2 == 0))

println("Partitioning a list gives a tuple where first element is List of filtered values and second is list of remaining")
println(a.partition(_ % 2 == 0))