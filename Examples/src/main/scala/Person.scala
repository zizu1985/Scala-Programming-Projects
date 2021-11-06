case class Person(firstName: String = "Adam",lastName: String ="Niezgoda",age: Int = 10)
{
  val description = s"$firstName $lastName is $age ${if (age <= 1) "year" else "years"} old"
}

object Person {
  /*
  def filterAdult(persons: List[Person]) : List[Person] = {
    for {
      person <- persons if (person.age >= 18)
    } yield (person)
  }
   */
  def filterAdult(persons: List[Person]): List[Person] = {
    persons.filter(_.age >= 18)
  }
}
