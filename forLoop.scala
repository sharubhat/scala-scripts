#!/usr/bin/env scala

for(i <- 0 to 4)
  print(i + ", ")
print("0 to 4 - Scala for loop <= \n")

for(i <- 0 until 4)
  print(i + ", ")
print("0 until 4 - Scala for loop < \n")

print("The left of the arrow (<-) defines a val, not a var, and its right side is a generator expression. On each iteration, a new val is created and initialized with a consecutive element from the generated values. \n")
