package doc

class ClassWithNoConstructorAndNoAttributes

// VAR and VAL constructor params are public attributes (X, Y)
// Z is a private attribute
class ClassWithConstructor(var x: Int, val y: Int, z: Int)

class ClassWithGetterAndGetter:
  private var _x: Int = 0
  private var _y: Int = 0

  //Getter X
  def x: Int = _x

  //Setter X
  def x_=(newValue: Int): Unit =
    _x = newValue

  //Getter Y
  def y: Int = _y

  //Setter Y
  def y_=(newValue: Int): Unit =
    _y = newValue

class ClassWithAuxiliaryConstructor(val x: Int, val y: Int):
  private var _z: Int = 0

  //Auxiliary constructors cannot have public parameters (VAR or VAL)
  def this(x: Int, y: Int, z: Int) =
    this(x, y)
    _z = z