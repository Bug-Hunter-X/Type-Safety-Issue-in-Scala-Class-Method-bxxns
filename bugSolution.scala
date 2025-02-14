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

  // This will now cause a compile-time error due to type mismatch
  //println(instance1.myMethod(instance2))

  val instance3 = new MyClass(20)
  println(instance1.myMethod(instance3)) // This is type safe 
}
```