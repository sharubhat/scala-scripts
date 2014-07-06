#!/usr/bin/env scala

val list = List(1, 2, 3, 4, 5, 6)

def product(ints: List[Int]) = {
	def productAcc(ints: List[Int], acc: Int): Int = ints match {
		case Nil => acc
		case x :: tail => productAcc(tail, x * acc)
	}
	productAcc(ints, 1)
}

println("Product using tail recursion is " + product(list))