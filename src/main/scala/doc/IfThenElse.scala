package doc

def runIfElse(age: Int): Unit =
  //one line
  if age >= 18 then println("It's OK")

  //only if
  if age >= 18 then
    println("It's OK")
    //do other things

  //if else
  if age >= 18 then
    println("It's OK")
  else
    println("It's not allowed")
  end if //it's optional

  //if else always return value
  val result = if age >= 18 then "It's OK" else "It's not allowed"
  println(result)