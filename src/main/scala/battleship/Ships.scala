package battleship

abstract class Ship(val name: String, val size: Int)

class Carrier extends Ship("Carrier", 5)

class Battleship extends Ship("Battleship", 4)

class Destroyer extends Ship("Destroyer", 3)

class Submarine extends Ship("Submarine", 3)

class PatrolBoat extends Ship("PatrolBoat", 2)
