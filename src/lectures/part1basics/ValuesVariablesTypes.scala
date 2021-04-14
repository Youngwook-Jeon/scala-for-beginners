package lectures.part1basics

object ValuesVariablesTypes extends App {

  val x: Int = 42
  println(x)

  // VALs ARE IMMUTABLE!
  // Compiler can infer types

  val aString: String = "hello"; val anotherString = "goodbye" // possible, but bad style
  val aBoolean: Boolean = false
  val aChar: Char = 'a'
  val anInt: Int = x
  val aShort: Short = 4613
  val aLong: Long = 235203952394L
  val aFloat: Float = 2.0f
  val aDouble: Double = 3.14

  // variables (mutable)
  var aVariable: Int = 4
  aVariable = 5

}
