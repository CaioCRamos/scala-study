package battleship
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.funspec.AnyFunSpec

class HorizontalPositioningTest extends AnyFunSuite:
  test("Should create with size provided") {
    val result = HorizontalPositioning.create(5)
    assert(result.length == 5)
  }

  test("Should create all coordinates in the same line") {
    val result = HorizontalPositioning.create(5)
    assert(result.distinctBy(x => x(0)).length == 1)
  }

class VerticalPositioningTest extends AnyFunSuite:
  test("Should create with size provided") {
    val result = VerticalPositioning.create(5)
    assert(result.length == 5)
  }

  test("Should create all coordinates in the same column") {
    val result = VerticalPositioning.create(5)
    assert(result.distinctBy(x => x(1)).length == 1)
  }
