#!/usr/bin/env scala

import scala.math.BigInt

def fib1(n: Int): Int = n match {
	case 0 | 1 => n
	case _ => fib1(n - 1) + fib1(n -2)
}

println("Fib of 6 - old style recursion : " + fib1(6))

def fib2(n: Int) = {
	def fib_tail(n: Int, a: Int, b: Int): Int = n match {
		case 0 => a
		case _ => fib_tail(n - 1, b, b + a)
	}
	fib_tail(n, 0, 1)
}

println("Fib of 6 using tail recursion : " + fib2(6))

lazy val fibs: Stream[BigInt] = BigInt(0) #:: BigInt(1) #:: fibs.zip(fibs.tail).map{n => n._1 + n._2}

println("Fib of 20 using streams : " + (fibs take 20).last)

fibs take 20 foreach println