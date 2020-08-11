var myArr = Array(1,2,3,5,6)
println(myArr.length)
myArr.getClass
myArr(0)
println(myArr(4))
myArr(myArr.length-1)
myArr.drop(1)
myArr.take(1)
myArr.last
myArr(3) = 9000
myArr
//I am overwriting old array with new array if val is used
myArr = myArr :+ 555
myArr
//myArr = "Different type" --- this does not work in Scala
//myArr = Array("Valdis","Peteris","Liga") --- same as above

myArr = Array(3,32,52,2,6,1,-45353535)
myArr

myArr :++ Array(5,7,10)
myArr
res12
myArr.min
myArr.max
myArr.reverse
val newArr = myArr :+ 65343
newArr.slice(2,6)
val insertedArr = newArr.slice(0,6) :++ Array (10,20,30) :++ newArr.slice(6,9)
insertedArr

insertedArr.contains(10)
insertedArr.contains(11)
insertedArr.indexOf(10)
insertedArr(6)
insertedArr.dropRight(2)
insertedArr.take(2)
insertedArr.sum
insertedArr.product
insertedArr.foreach(println)

val mySeq = Seq(1,2,3,4,55,6,6,7)
mySeq.length
mySeq.max
mySeq.min
mySeq.getClass

import scala.collection.mutable //typically you import at the beginning of the file

val myMutableSeq = mutable.ArrayBuffer(1,3,6,7,8,8,10)
myMutableSeq

myMutableSeq(0) = 1000
myMutableSeq

myMutableSeq.product
myMutableSeq += 5000
myMutableSeq ++= Array(3,3,3,10)
myMutableSeq

//after all the data mutating lets copy to immutable

val immutableSeq = myMutableSeq.toArray
immutableSeq.getClass

