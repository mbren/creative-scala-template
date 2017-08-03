import doodle.core._
import doodle.core.Image._
import doodle.syntax._
//import doodle.jvm.Java2DCanvas._
import doodle.jvm.Java2DFrame._
import doodle.backend.StandardInterpreter._

//Exercises from http://www.scalabridge.org/creative-scala-v2.html#getting-started

//Image.circle(10)
//
//circle(10)
//circle(10).draw
//rectangle(100, 50).draw
//triangle(60, 40).draw
//
////I Go Round in Circles
////Create circles that are 1, 10, and 100 units wide. Now draw them!
//
//circle(1).draw
//circle(10).draw
//circle(100).draw
//
////My Type of Art
////What is the type of a circle? A rectangle? A triangle?
//// Answer: doodle.core.Image
//
////Not My Type of Art
////What’s the type of drawing an image? What does this mean?
//// Answer: Unit because it doesnt' return anything.
//
//(circle(10) beside rectangle(10, 20)).draw
//(circle(10) beside circle(20)).draw
//(circle(10) above circle(20)).draw
//(circle(10) below circle(20)).draw
//(circle(10) on circle(20)).draw
//(circle(10) under circle(20)).draw

//The Width of a Circle
//Create the picture fig. 5 using the layout methods and basic images we’ve covered so far.
//my solution
// (circle(30) under (circle(10) beside circle(10) beside circle(10))).draw
//book solution is
//(circle(20) beside circle(20) beside circle(20)) on circle(60)
//but should be:
//((circle(20) beside circle(20) beside circle(20)) on circle(60)).draw

// Some of the methods to add color to images in Doodle.
//(circle(10) fillColor Color.red).draw
//(circle(10) lineColor Color.blue).draw
//(circle(10) lineWidth 3).draw

//3.3
//Evil Eye
//Make the image in fig. 6, designed to look like a traditional amulet protecting against the evil eye. I used cornflowBlue for the iris, and darkBlue for the outer color, but experiment with your own choices!
//((circle(50) fillColor Color.darkBlue) under
//  (circle(30) fillColor Color.white) under
//  (circle(20) fillColor Color.lightBlue) under
//  (circle(10) fillColor Color.black)).draw

//3.4
//(triangle(40, 40) fillColor Color.hsl(0.degrees, 0.8.normalized, 0.6.normalized)).draw
//3.4.2
//((circle(100) fillColor Color.red) beside
//  (circle(100) fillColor Color.red.spin(15.degrees)) beside
//  (circle(100) fillColor Color.red.spin(30.degrees))).lineWidth(5.0).draw

//3.4.3
//(((circle(20) fillColor (Color.red darken 0.2.normalized))
//  beside (circle(20) fillColor Color.red)
//  beside (circle(20) fillColor (Color.red lighten 0.2.normalized))) above
//  ((rectangle(40,40) fillColor (Color.red desaturate 0.6.normalized))
//    beside (rectangle(40,40) fillColor (Color.red desaturate 0.3.normalized))
//    beside (rectangle(40,40) fillColor Color.red))).draw

//3.4.4
//((circle(40) fillColor (Color.red.alpha(0.5.normalized))) beside
//  (circle(40) fillColor (Color.blue.alpha(0.5.normalized))) on
//  (circle(40) fillColor (Color.green.alpha(0.5.normalized)))).draw

//Complementary Triangles
//Create three triangles, arranged in a triangle, with complementary colors. Complementary colors are colors that are similar in hue. See a (fairly elaborate) example in fig. 13.
//((triangle(40,40) fillColor (Color.darkSlateBlue.spin(0.degrees)))
//    above (triangle(40,40) fillColor (Color.darkSlateBlue.spin(50.degrees))
//    beside (triangle(40,40) fillColor Color.darkSlateBlue.spin(100.degrees)))).draw

//3.5.1 Compilation Target
//Create a line drawing of an archery target with three concentric scoring bands, as shown in fig. 14.
(circle(30) under
  circle(20) under
  circle(10)).draw
//For bonus credit add a stand so we can place the target on a range, as shown in fig. 15.
((circle(30) fillColor Color.red under
  circle(20) fillColor Color.white under
  circle(10) fillColor Color.red) above
  rectangle(6, 20) fillColor Color.white above
  rectangle(20, 6) fillColor Color.brown above
  rectangle(40, 10) fillColor Color.green).draw