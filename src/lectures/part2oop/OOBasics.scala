package lectures.part2oop

object OOBasics extends App {

  val person = new Person("John", 26)
  println(person)
  println(person.age)
  person.greet("Mayer") // John says: Hi, Mayer
  person.greet() // Hi, I am John

  val author = new Writer("Young", "wook", 2002)
  val imposter = new Writer("Young", "wook", 2002)
  val novel = new Novel("Yeah", 2015, author)
  println(novel.authorAge())
  println(novel.isWrittenBy(imposter)) // false

  val counter = new Counter
  counter.inc.inc.inc.print
  counter.inc(5).print
}

// constructor
class Person(name: String, val age: Int) {
  val x = 2
  println(1 + 3)

  def greet(name: String): Unit = println(s"${this.name} says: Hi, $name")

  // overloading
  def greet(): Unit = println(s"Hi, I am $name")

  // multiple constructors
  def this(name: String) = this(name, 0)
  def this() = this("John Doe")
}

// class parameters are NOT FIELDS!
// Adding keyword val => converts params to fields

/*
  Novel and a Writer
  writer: first name, surname, year
    - method fullname
  novel: name, year of release, author
    - authorAge
    - isWrittenBy(author)
    - copy(new year of release) = new instance of Novel
*/
class Writer(firstName: String, surname: String, val year: Int) {
  def fullName: String = firstName + " " + surname
}

class Novel(name: String, year: Int, author: Writer) {
  def authorAge(): Int = year - author.year
  def isWrittenBy(author: Writer) = author == this.author
  def copy(newYear: Int): Novel = new Novel(name, newYear, author)
}

/*
  Counter class
    - receives an int value
    - method current count
    - method to inc/dec => new Counter
    - overload inc/dec to receive an amount
*/
class Counter(val count: Int = 0) { // default value
  def inc = new Counter(count + 1) // immutability
  def dec = new Counter(count - 1)

  def inc(n: Int): Counter = {
    if (n <= 0) this
    else inc.inc(n - 1)
  }

  def dec(n: Int): Counter = {
    if (n <= 0) this
    else dec.dec(n - 1)
  }

  def print = println(count)
}
