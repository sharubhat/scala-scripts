#!/usr/bin/env scala
class Complex(val real: Int, val imaginary: Int) {
	def +(operand: Complex): Complex = {
		new Complex(this.real + operand.real, this.imaginary + operand.imaginary)
	}
	
	override def toString = {
		real + (if(imaginary < 0) "" else "+") + imaginary + "i"
	}
}

println(new Complex(3, 4) + new Complex(3, -5))