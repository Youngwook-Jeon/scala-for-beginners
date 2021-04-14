package lectures.part1basics

object Expressions extends App {

  val x = 1 + 2
  println(x)

  println(2 + 3 * 4)
  println(1 == x)
  println(!(1 == x))

  var aVariable = 2
  aVariable += 3

  // Instructions (DO) vs Expressions (VALUE)

  // if expression
  val aCondition = true
  val aConditionedValue = if(aCondition) 5 else 3 // if expression
  println(aConditionedValue)

  var i = 0
  val aWhile = while (i < 10) {
    println(i)
    i += 1
  } // Pattern: aWhile: Unit
  // NEVER WRITE THIS AGAIN

  // EVERYTHING in Scala is an Expression!
  val aWeirdValue = (aVariable = 3) // Unit === void
  println(aWeirdValue) // ()

  // side effects: println(), whiles, reassining -> returns a Unit

  // Code block (also an expression)
  val aCodeBlock = {
    val y = 2
    val z = y + 1
    if (z > 2) "hello" else "goodbye"
  } // Pattern: aCodeBlock: String
  // the value of the block is the value of its last expression

  // val anotherValue = z + 1 -> not visible outside of the block
  // instructions are executed(think Java), expressions are evaluated(Scala)

  // 1. diff between "hello world" vs println("hello world")
  // ans) "hello world" -> a String value, println("hello world") -> an expression returning a Unit
  // 2.

  val someValue = {
    2 < 3
  }

  val someOtherValue = {
    if(someValue) 239 else 906
    42
  }

  println(someValue) // true
  println(someOtherValue) // 42
}
