import doodle.core._
import doodle.core.Image._
import doodle.syntax._
//import doodle.jvm.Java2DCanvas._
import doodle.jvm.Java2DFrame._
import doodle.backend.StandardInterpreter._

//4.3.2
//val one = 1
//val anImage = Image.circle(100).fillColor(Color.red)
//anImage.draw

//4.4 Abstraction
//(
//  Image.rectangle(40, 40).
//    lineWidth(5.0).
//    lineColor(Color.royalBlue.spin(30.degrees)).
//    fillColor(Color.royalBlue) beside
//    Image.rectangle(40, 40).
//      lineWidth(5.0).
//      lineColor(Color.royalBlue.spin(30.degrees)).
//      fillColor(Color.royalBlue) beside
//    Image.rectangle(40, 40).
//      lineWidth(5.0).
//      lineColor(Color.royalBlue.spin(30.degrees)).
//      fillColor(Color.royalBlue) beside
//    Image.rectangle(40, 40).
//      lineWidth(5.0).
//      lineColor(Color.royalBlue.spin(30.degrees)).
//      fillColor(Color.royalBlue) beside
//    Image.rectangle(40, 40).
//      lineWidth(5.0).
//      lineColor(Color.royalBlue.spin(30.degrees)).
//      fillColor(Color.royalBlue)
//  ).draw

//val box =
//  Image.rectangle(40, 40).
//    lineWidth(5.0).
//    lineColor(Color.royalBlue.spin(30.degrees)).
//    fillColor(Color.royalBlue)
//
//val bunch = box beside box beside box beside box beside box
//bunch.draw

//4.4 Archery Again
//Let’s return to the archery target we created in an earlier chapter, shown in fig. 18.
//val target = (circle(30) fillColor Color.red under
//  circle(20) fillColor Color.white under
//  circle(10) fillColor Color.red)
//val stand = rectangle(6, 20) fillColor Color.white above
//  rectangle(20, 6) fillColor Color.brown above
//  rectangle(40, 10) fillColor Color.green
//val together = target above stand
//  together.draw

//Streets Ahead
//For a more compelling use of names, create a street scene like that shown in fig. 19. By naming the individual components of the image you should be able to avoid a great deal of repetition.
//val house = triangle (50, 40) fillColor Color.brown above
//  (rectangle(50, 40) fillColor Color.red under (rectangle(10, 10) fillColor Color.red lineWidth 0 above rectangle(10, 30) fillColor Color.black))
//val tree = circle(30) fillColor Color.green above rectangle(10, 20) fillColor Color.brown
//val line = rectangle(30, 3) fillColor Color.yellow beside rectangle(10, 3)
//val street = line beside line beside line on rectangle(150, 10) fillColor Color.black
//val block = house beside tree above street
//val scene = block beside block beside block
//scene.draw

