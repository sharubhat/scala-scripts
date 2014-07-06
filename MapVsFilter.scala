#!/usr/bin/env scala

println("Map vs Filter in below example : ")
println("val x = from(1) map (_ * N)")
println("val x = from(1) filter (_ % N == 0)")
println("""Both of these give same result. But, first example starts with n and for each n it produces n * N which will be faster and better. 
Second example first produces 1, 2, 3 etc and then filters out only those that correspond to _ % N which means more work. 
So, prefer map when possible""")