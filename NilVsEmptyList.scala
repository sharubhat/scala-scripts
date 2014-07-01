#!/usr/bin/env scala

println("Nil == List() : " + (Nil == List()))
println("Nil eq List() : " + (Nil eq List()))
println("Nil hashcode : " + System.identityHashCode(Nil))
println("List() hashcode : " + System.identityHashCode(List()))

println("This proves Nil and List() are equivalent, however Nil is more idiomatic")