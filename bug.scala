```scala
class MyClass[T](val value: T) {
  def myMethod(implicit ev: T => Ordered[T]): T = value
}

object Main extends App {
  implicit val intOrdering = Ordering.Int
  val myInt = new MyClass(5)
  println(myInt.myMethod)

  val myString = new MyClass("hello")
  // println(myString.myMethod) // This line will cause a compilation error
}
```