#!/usr/bin/env scala

def sum(list: List[Int]): Int = {
	var sum = 0
	for(i <- list) {
		sum += i
	}
	sum
}

println("Imperative style coding " + sum(List(1, 2, 3, 4, 5)))

println("Functional way of coding " + List(1, 2, 3, 4, 5).foldLeft(0) {
	(carryover, e) => carryover + e
})