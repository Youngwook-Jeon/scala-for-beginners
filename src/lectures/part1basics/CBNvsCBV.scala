package lectures.part1basics

object CBNvsCBV extends App {

  def calledByValue(x: Long): Unit = {
    println("by value: " + x)
    println("by value: " + x)
  }

  def calledByName(x: => Long): Unit = { // => tells the compiler that the parameter will be called by name
    println("by value: " + x)
    println("by value: " + x)
  }

  calledByValue(System.nanoTime())
  calledByName(System.nanoTime())
  /*
    by value: 5470185100217
    by value: 5470185100217
    by value: 5470415269669
    by value: 5470415335377
  */

  def infinite(): Int = 1 + infinite()
  def printFirst(x: Int, y: => Int) = println(x)

  printFirst(34, infinite()) // 34, the param y is not used. it is never actually evaluated.
}
