package doc

abstract class Animal:
  def name: String

abstract class Pet extends Animal

class Cat extends Pet:
  override def name: String = "Cat"

class Dog extends Pet:
  override def name: String = "Dog"

class Lion extends Animal:
  override def name: String = "Lion"

//Only types derived from Pet
class PetContainer[P <: Pet](p: P):
  def pet: P = p

val dogContainer = PetContainer[Dog](Dog())
val catContainer = PetContainer[Cat](Cat())

// this would not compile
//val lionContainer = PetContainer[Lion](Lion())