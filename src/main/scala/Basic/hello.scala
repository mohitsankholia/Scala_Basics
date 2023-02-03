package Basic

object hello extends App {

//  def main(args: Array[String]): Unit = {
//    println("Hello World")
//  }

  println("Step 1: How to initialize a String Array with 3 elements")
  private val array1: Array[String] = Array("Plain Donut", "Strawberry Donut", "Chocolate Donut")
  println(s"Elements of array1 = ${array1.mkString("/")}")
}
