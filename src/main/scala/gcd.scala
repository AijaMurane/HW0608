import scala.io.StdIn.readLine

object gcd extends App {
var i = 0 //i stands for iterator

  //the while loop runs while i<10 == true
  while (i<10) {
    println(i)
    i +=1
  }
  println(s"i is $i")

  var sum = 0.toLong
  i = 0
  val max = 5000.toLong
  //println("How far do you want to count?")
  //val max = readLine().toLong
  while (i<=max) {
    sum += i
    i +=1
  }
  println(s"Sum of numbers up to and including $max is $sum")
  println(s"Lazy Gauss would have solved it like this ${max*(max+1)/2}")

  //do while loops are rare
  i = 10
  do {
    println(s"i is $i")
    i -= 1
  } while (i > 30)

  //definign function outside main object
  //greatest common divider
  def gcdLoop(x:Long, y:Long):Long = {
    var a = x
    var b = y
    while (a != 0) {
      val temp = a // we save a
      a = b % a
      b = temp //b is old a
    }
    b

  }

  //snake eating its own tail
  def recursiveGCD(x: Long, y: Long):Long = if (y==0) x else recursiveGCD(y,x%y)



println(gcdLoop(15,10))
println(gcdLoop(12,10))
println(gcdLoop(20,10))
println(gcdLoop(50,42))
println(gcdLoop(24,18))

  println(recursiveGCD(24,18))
  println(recursiveGCD(15,10))
}



