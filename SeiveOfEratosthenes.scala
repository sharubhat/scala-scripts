#!/usr/bin/env scala

def from(n: Int): Stream[Int] = n #:: from(n + 1)
def seive(s: Stream[Int]): Stream[Int] = s.head #::seive(s.tail filter(_ % s.head != 0))
val primes = seive(from(2))

println("First 100 primes are : " + (primes take 100).toList)

println("Primes less than 100 are : " + primes.takeWhile(_ < 100).toList)	