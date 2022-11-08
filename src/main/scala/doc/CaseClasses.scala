package doc

//Case classes are used for immutable data
//It is not necessary use VAR or VAL in parameters, they are public by default
case class Book(isbn: String)

//There are no need of NEW
val frankenstein = Book("978-0486282114")

//They are compared as values, not reference
val book1 = Book("1234567890")
val book2 = Book("1234567890")

val sameBook = book1 == book2 //true