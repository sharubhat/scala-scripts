#!/usr/bin/env scala

val mylist = List(1, 2, 3, 4, 5, 6)

def sumSelectValues(list: List[Int], f: Int => Boolean) = {
	var sum = 0
	list.foreach {
		e => if(f(e)) sum += e
	}
	sum
}
def sum(list: List[Int]) = {
	var sum = 0
	for(i <- list) {
		sum += i
	}
	sum
}

def sum1(list: List[Int]) = {
	var sum = 0;
	list.foreach{ e => sum += e}
	sum
}

def sumEven(list: List[Int]) = {
	var sum = 0;
	list.foreach{ 
		e => if(e % 2 == 0) sum += e
	}
	sum
}

println("Imperative style coding " + sum(mylist))

println("Sum using foreach on list " + sum1(mylist))

println("Sum of only even numbers without abstraction " + sumEven(mylist))
println("Sum of only even numbers with abstraction " + sumSelectValues(mylist, e => e % 2 == 0))

// note that e => e > 4 can also be represented as _ > 4 which means anything greater than 4
println("Sum of entries greater than 4 is " + sumSelectValues(mylist, _ > 4))

println("Functional way of coding sum " + mylist.foldLeft(0) {
	(carryover, e) => carryover + e
})