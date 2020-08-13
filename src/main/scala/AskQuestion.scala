import scala.io.StdIn.readLine

object AskQuestion extends App {
  val b = 15
  println("Enter your number please")
  val c = readLine().toInt
  val answer =
    if (b>c)
      "B is larger than your answer"
    else if (c>b)
      "Your answer is larger or equal to B"
    else "B is equal to your answer"
  println(answer)
}
