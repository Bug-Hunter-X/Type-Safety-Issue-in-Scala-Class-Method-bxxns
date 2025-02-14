```scala
class MyClass[T](val value: T) {
  def myMethod(other: MyClass[T]): T = {
    // Some logic here
    value
  }
}

object Main extends App {
  val instance1 = new MyClass(10)
  val instance2 = new MyClass("Hello")

  // Compile-time error below because myMethod is not type safe
  println(instance1.myMethod(instance2))
}
```