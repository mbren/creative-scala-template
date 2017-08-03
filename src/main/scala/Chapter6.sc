import doodle.core._
import doodle.core.Image._
import doodle.syntax._
//import doodle.jvm.Java2DCanvas._
import doodle.jvm.Java2DFrame._
import doodle.backend.StandardInterpreter._

//6.1
def boxes(color: Color): Image = {
  val box =
    Image.rectangle(40, 40).
      lineWidth(5.0).
      lineColor(color.spin(30.degrees)).
      fillColor(color)

  box beside box beside box beside box beside box
}

// Create boxes with different colors
//boxes(Color.paleGoldenrod).draw
//boxes(Color.lightSteelBlue).draw
//boxes(Color.mistyRose).draw

//Square
//Write a method square that accepts an Int argument and returns the Int square of it’s argument. (Squaring a number is multiplying it by itself.)
def square(x: Int): Int = {
  x * x
}

//square(9)

//Halve
//Write a method halve that accepts a Double argument and returns the Double that is half of it’s argument.

def halve(i: Double): Double = {
  i / 2
}

halve(4)