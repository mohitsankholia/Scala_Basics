package Basic

object Range_Tutorial extends App {

  println("Step 1: Create a simple numeric range from 1 to 5 inclusive")
  val from1To5 = 1 to 5
  println(s"Range from 1 to 5 inclusive = $from1To5")



  println("\nStep 2: Create a numeric range from 1 to 5 but excluding the last integer number 5")
  val from1Until5 = (1 until 5)
  println(s"Range from 1 until 5 where 5 is excluded = $from1Until5")


  val value = "5".toInt
  println(s"value is = $value")

  println("\nStep 3: Create a numeric range from 0 to 10 but increment with multiples of 2")
  val from0To10By2: List[Int] = (0 to 10 by 2).toList
  println(s"Range from 0 to 10 with multiples of 2 = $from0To10By2")



  println("\nStep 4: Create an alphabetical range to represent letter a to z")
  val alphabetRangeFromAToZ = ('a' to 'z').toString()
  println(s"Range of alphabets from a to z = $alphabetRangeFromAToZ")



  println(s"\nStep 5: Character ranges with user specified increment")
  val alphabetRangeFromAToZBy2 = 'a' to 'z' by 2
  println(s"Range of every other alphabet = $alphabetRangeFromAToZBy2")



  println("\nStep 6: Storing our ranges into collections")
  val listFrom1To5 = (1 to 5).toList
  println(s"Range to list = ${listFrom1To5.mkString(" ")}")

  val setFrom1To5 = (1 to 5).toSet
  println(s"Range to set = ${setFrom1To5.mkString(" ")}")

  val sequenceFrom1To5 = (1 to 5).toSeq
  println(s"Range to sequence = ${sequenceFrom1To5.mkString(" ")}")

  val arrayFrom1To5 = (1 to 5).toArray
  println(s"Range to array = `${arrayFrom1To5.mkString(" ")}")



  // Tip:
  // - To print every element in the array variable called arrayFrom1To5
  arrayFrom1To5.foreach(print(_))


}
