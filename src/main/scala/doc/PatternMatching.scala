import scala.util.Try

def calculate(num1: Int, num2: Int, operation: String): Int =
  operation match
    case "+" => num1 + num2
    case "*" => num1 * num2
    case "-" => num1 - num2
    case "/" => Try(num1 / num2).getOrElse(0)
    case _ => 0
