package battleship

import scala.util.Random

class ShipPosition:
  val ship: Ship
  val positions: List[(Int, Int)]
  
  def this(ship: Ship) =
    ship = ship
    positions = buildRandomPosition()
    
  private def buildRandomPosition(): List[(Int, Int)] =
    Random.between(0, 2) match {
      case 0 => VerticalPositioning.create(ship.size)
      case _ => HorizontalPositioning.create(ship.size)
    }

trait Positioning:
  def create(size: Int): List[(Int, Int)]

object VerticalPositioning extends Positioning:
  def create(size: Int): List[(Int, Int)] =
    val column = Random.between(0, 10)
    val lineStart = Random.between(0, 10 - size)

    (0 until size).map(x => (lineStart + x, column)).toList

object HorizontalPositioning extends Positioning:
  def create(size: Int): List[(Int, Int)] =
    val line = Random.between(0, 10)
    val columnStart = Random.between(0, 10 - size)

    (0 until size).map(x => (line, columnStart + x)).toList