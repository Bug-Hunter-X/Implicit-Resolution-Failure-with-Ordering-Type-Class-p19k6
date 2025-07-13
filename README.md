# Implicit Resolution Failure in Scala

This example demonstrates a common error related to implicit resolution in Scala when working with type parameters and type classes like `Ordering`.  The `MyClass` uses an implicit `Ordering` instance to compare values, but it doesn't handle cases where a suitable implicit isn't available for the type parameter.

The `bug.scala` file showcases the issue: attempting to call `myMethod` with a `String` type will result in a compilation failure because there's no implicit `Ordering[String]` in scope by default. The solution involves either providing an explicit `Ordering[String]` or making the implicit parameter optional and providing default behavior.

The `bugSolution.scala` offers a fix that handles this problem gracefully.