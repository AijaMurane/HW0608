import java.io.File
import java.nio.file.Paths

for (i <-1 to 5) {
  println(s"i is $i")
}


for (i <- 1 until 5 by 2) {
  println(s"i is $i")
}

//using for loop print all even numbers from 2 to 10 including
for (i <- 2 to 10 by 2) {
  println(s"i is $i")
}

for (i <- Array(10,20,30)) {
  println(s"i value is $i")
}

val myFiles = (new File(".")).listFiles()
for (file <- myFiles) println(file)

println(Paths.get(".").toAbsolutePath)

val myGitHubDir = {
  (new File("C:\\Users\\Kasutaja\\IdeaProjects\\Scala_playground\\src\\main\\scala").listFiles())
}
for (file <- myFiles) println(file)

new File("C:\\Users\\").listFiles().foreach(println)

Array(10,20,30).foreach(println)
Array(10,20,30).foreach(item => println(s"Answer is $item"))

for (item <- Array(10,20,25)) println(s"Answer is $item")

print("*")
print(" ")

print(" "*5)
print("*"*3)
print(" "*3 + "*"*5)
