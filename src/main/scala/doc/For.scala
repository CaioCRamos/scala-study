package doc

def runFor(): Unit =
  //Iterates over a sequence
  val ints = Seq(1, 2, 3)
  for i <- ints do println(i)

  //Multiple lines
  for i <- ints
  do
    val x = i * 2
    println(s"i = $i, x = $x")

  //Simple generators
  for
    i <- 1 to 10
  do
    println(s"i = $i")

  //Multiple generator
  for
    i <- 1 to 2
    j <- 'a' to 'b'
    k <- 1 to 10 by 5
  do
    println(s"i = $i, j = $j, k = $k")

  //With guards
  for
    i <- 1 to 10
    if i > 3
    if i < 6
    if i % 2 == 0
  do
    println(i)

  //Iterate over maps
  val states = Map(
    "AK" -> "Alaska",
    "AL" -> "Alabama",
    "AR" -> "Arizona"
  )

  for (abbrev, name) <- states do println(s"{$abbrev:$name}")

  //FOR expressions to return value
  val list =
    for i <- 10 to 12
      yield i * 2

  //Or
  val sameListAbove = (10 to 12).map(i => i * 2)
