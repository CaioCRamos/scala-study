package doc

class Types:
  def valueTypes(): Unit =
    /*
      Value Types
      - Extends anyVal
      - non-nullable (val test: Int = null it's not possible)
      - 9 primitive types (Double, Float, Long, Int, Short, Byte, Char, Boolean and Unit)
    */

    val valueTypes = List(
      "a string",
      10, //int
      10.5, //float,double
      true, //boolean
      'c', //char
      () //unit (void)
    )

    valueTypes.foreach(println(_)) // println(_) same as value => println(value)

  def referenceTypes(): Unit =
    /*
      Reference Types
      - extends anyRef
      - List, Option, any type created
    */

    class Point(x: Int, y: Int):
      override def toString: String = s"($x, $y)"

    val referenceTypes = List(
      new Point(10, 30),
      List(1, 2, 3)
    )

    referenceTypes.foreach(println(_))
end Types
