import doodle.core._
import doodle.core.Image._
import doodle.syntax._
import doodle.jvm.Java2DFrame._
import doodle.backend.StandardInterpreter._

// To use this example, open the SBT console and type:
//
// Example.image.draw
//Question 4.3
object Example {
//val image = circle(10).fillColor(Color.red) on circle(20) on circle(30)
  val image = circle(100) fillColor Color.paleGoldenrod lineColor Color.indianRed

  def main(args: Array[String]): Unit = {
    image.draw
  }
}
