//Works as Java Interfaces
//But can have implementations

trait Pet:
  val name: String

class Cat(val name: String) extends Pet
class Dog(val name: String) extends Pet