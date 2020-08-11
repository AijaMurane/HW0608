def print2(): Unit = {
  println("One line")
  println("Second line")

}

print2()

def add(a:Int, b:Int) = { //Unit is an empty return
  val result = a + b
  println(result) //sideeffect
}
add(5,10)

def mult(a:Int, b:Int) = {
  a*b //in Scala the last line is returned
}

mult(6,10)+10+100

//mult(0.6,0.7)

def multAny(a: Double, b:Double) = {
  a*b
}
multAny(9.11,9.37)
multAny(10,2)

def addAndMultiply(a: Double, b: Double, c: Double) = {
  add(multAny(a,b).toInt,multAny(b,c).toInt)
}

addAndMultiply(2,3,4)

val myResult = addAndMultiply(3,4,5)
println(myResult)

//do not mutate outside variable!!
var myMutable = 10
//you cannot tell if muttateOutside is correct or not
def mutateOutside() ={
  myMutable +=5
  println(myMutable)
}
mutateOutside()
mutateOutside()
mutateOutside()

//instead this:
def add5(a:Int) = {
  a+5
}
add5(10) //can test if works correctly
add5(100)

myMutable = add5(myMutable)
myMutable

//pure function is without sideeffects

//make a function which returns reversed and upercase string
def getReversedUpper(text:String):String = {
  //println(s"Going to reverse: $text")
  text.toUpperCase.reverse
}

getReversedUpper("Beer")
getReversedUpper("VALDIS") == "SIDLAV"

def getStringLength(text:String):Int = {
  //text.length
  val myLocal = text.length
  myLocal
}

getStringLength("Valdis")

def getResults(a:Int, txt:String): Int = {
  var result = 0
  result = a * txt.length
  result += 1000
  result //last line is what gets returned

}

getResults(10,"Valdis")

def getMax(a:Int, b:Int)={
    var result = 0
  if (a>b) {result = a}
  else {result = b}
result}

getMax(10,20)
getMax(5,3)

val a = 4
if (a == 2*2) {
  println("A is 4")
}
else {
  println("A is not 4")
}

def isEqualTo4(a:Int): Boolean = {
  if (a == 2*2) {
    true
  }
  else {
    false
  }
}

isEqualTo4(4)
isEqualTo4(5)

def isEqualTo4(a:Int): Boolean = {
  a == 2*2
}

isEqualTo4(4)
isEqualTo4(5)

5 > 2*2
4 >= 2 * 2
4 != 5
4 != 4

val myName = "Valdis"
if (myName == "Valdis") {
  println("Wow that is my name too")
}
println("This happens all the time")

def checkName(myName:String, friendName:String) = {
  if (myName == friendName) {
    println(s"Wow our names match perfectly my dear $friendName!")
  }
  println("no matter")
}

checkName("Valdis", "Līga")
checkName("Valdis","Valdis")