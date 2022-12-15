package battleship

class Game:
  val ships: List[ShipPosition]

  private def initialize(): Unit =
    ()

  def run(): Unit =
    println("The game is running")
    println("-" * 65 + "\n")

    println(buildBoard())

    val carrier = new Carrier()
    val battleship = new Battleship()
    val destroyer = new Destroyer()
    val submarine = new Submarine()
    val patrolBoat = new PatrolBoat()

    val ships = List(carrier, battleship, destroyer, submarine, patrolBoat)

    var matrix = Array.tabulate(10, 10)((x, y) => 0)

    ships.foreach(ship => {
      ship.positions.foreach((l, c) => matrix(l)(c) = 1)
    })

//    for
//      x <- matrix
//      y <- x
//    do
//       println(y)

    matrix.map(_.mkString(" ")).foreach(println)

  def buildBoard(): String =
    var title = (0 to 9).map(x => x.toString).reduce((x, y) => x + "     " + y)
    title = s"      $title   \n"

    val positions = (0 to 9).map(y => {
      val topLine = s"   ${"------" * 10}-\n"
      val spaces = f"$y%2d ${"|     " * 10}|\n"

      topLine + spaces
    }).reduce((x, y) => x + y)

    val footer = s"   ${"------" * 10}-"

    title + positions + footer
