#!/usr/bin/env scala

val nums = List(4,8,12)

println("Result of foldLeft with starting value 0 is " + (0/:nums)(_ + _))
println("Result of foldLeft with starting value 10 is " + (10/:nums)(_ + _))

println("Result of reduceLeft is " + nums.reduceLeft(_ + _))
println("Note that reduceLeft does not take a starting value")


val names = List("Daniel", "Chris", "Joseph")
println(names.reduceLeft(_ + ", " + _))
