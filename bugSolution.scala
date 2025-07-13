```scala
class MyClass[T](val value: T) {
  def myMethod(implicit ev: Ordering[T] = Ordering.by(identity)): T = value
}

object Main extends App {
  implicit val intOrdering = Ordering.Int
  val myInt = new MyClass(5)
  println(myInt.myMethod)

  val myString = new MyClass("hello")
  println(myString.myMethod) // This now compiles and works
}
```