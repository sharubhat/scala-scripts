#!/usr/bin/env scala

import scala.annotation.tailrec

val list = List.range(1, 100)
println("Sum with possible StackOverflowError is " + sum(list))
println("Sum with tail recursion using accumulator is " + sumTailRecursiveWithAcc(list))
println("Sum using List api is " + list.sum)
println("Sum using reduceLeft is " + sumWithReduceLeft(list))

def sum(list: List[Int]): Int = list match {
  case List() => 0
  case x :: tail => x + sum(tail)
}

def sumTailRecursiveWithAcc(list: List[Int]): Int = {
  def sumAccumulator(list: List[Int], acc: Int): Int = list match {
	case Nil => acc
	case x :: tail => sumAccumulator(tail, acc + x)
  }
  sumAccumulator(list, 0)
}

def sumWithReduceLeft(list: List[Int]) = {
  list.reduceLeft(_ + _)
}

val list2 = List.range(1, 5)

println("Product with possible StackOverflowError is " + product(list2))
println("Product with tail recursion using accumulator is " + productTailRecurse(list2))

def product(list: List[Int]): Int = list match {
  case Nil => 1
  case x :: tail => x * product(tail)
}

def productTailRecurse(list: List[Int]): Int = {
  def productAccumulator(list: List[Int], acc: Int): Int = list match {
	case Nil => acc
	case x :: tail => productAccumulator(tail, acc * x)
  }
  productAccumulator(list, 1)
}