import doodle.core._
import doodle.core.Image._
import doodle.syntax._
//import doodle.jvm.Java2DCanvas._
import doodle.jvm.Java2DFrame._
import doodle.backend.StandardInterpreter._

val aBox = Image.rectangle(20, 20).fillColor(Color.royalBlue)

def boxes(count: Int): Image =
  count match {
    case 0 => Image.empty
    case n => aBox beside boxes(n-1)
  }

//boxes(3).draw

//1 match {
//  case 2 => 4
//  case 4 => 8
//}
//Exercise 7.2 gives scala.MatchError
val aCircle = Image.circle(20)

def cross(count: Int): Image = {
  count match {
    case 0 => aCircle
    case n => aCircle beside (aCircle above cross(n-1) above aCircle) beside aCircle
  }
}

//cross(0).draw
//cross(1).draw
//cross(2).draw
//cross(3).draw

//def chessboard(count: Int): Image = {
//  val bd = (Image.rectangle(10, 10) fillColor Color.red beside
//    Image.rectangle(10, 10) fillColor Color.black) above
//    (Image.rectangle(10, 10) fillColor Color.black beside
//      Image.rectangle(10, 10) fillColor Color.red)
//
//  count match {
//    case 0 => bd
//    case n => (chessboard(n-1) beside bd) above bd
//  }
//}

def chessboard(count: Int): Image = {
  val blackSquare = Image.rectangle(30, 30) fillColor Color.black
  val redSquare = Image.rectangle(30, 30) fillColor Color.red
  val base =
    (redSquare beside blackSquare) above (blackSquare beside redSquare)
  count match {
    case 0 => base
    case n => val unit = chessboard(n-1)
      (unit beside unit) above (unit beside unit)
  }
}
//chessboard(0).draw
//chessboard(1).draw
//chessboard(2).draw

//7.4
//def sierpinski(count: Int): Image = {
//  val base = Image.triangle(10, 10) above (Image.triangle(10, 10) beside Image.triangle(10, 10))
//  val b3 = base above (base beside base)
//  count match {
//    case 0 => b3
//    case n => sierpinski(n - 1) above (sierpinski(n - 1) beside sierpinski(n - 1))
//  }
//}

def sierpinski(count: Int): Image = {
  val triangle = Image.triangle(10, 10) lineColor Color.blue
  count match {
    case 0 => triangle above (triangle beside triangle)
    case n =>
      val unit = sierpinski(n-1)
      unit above (unit beside unit)
  }
}

sierpinski(5).draw