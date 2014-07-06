#!/usr/bin/env scala

val list= List(1, 2, 3, 4, 5, 6, 5, 4, 3)

def max(nums: List[Int]) = {
	def maxAcc(nums: List[Int], maxNum: Int): Int = nums match {
		case Nil => maxNum
		case x :: tail => maxAcc(tail, if(maxNum < x) x else maxNum)
	}
	maxAcc(nums, 0)
}

println("Max of list using tail recursion is " + max(list))