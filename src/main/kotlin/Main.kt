fun main() {

    var alber = Human("Eddy", 42, 40.5)
    alber.eat(2)
    alber.birthday()
    alber.speak("Hello ladies and gentlemen.")


    var person = User("Jayden", "Musau", "Musaujayden@gmail.com", "0768214929", 7867)
    person.info("musaujayden@gmail.com")
    person.info1("0768214929")

}
//1. Create a class called Human with these attributes: name, age, weight. It has
//the following functions:
// eat(foodWeight: Int) :Prints “I am eating {foodWeight} kgs of food”
//and increments the human’s weight by the weight of the food eaten
class Human(var name:String, var age:Int, var weight:Double ) {
    fun eat(foodWeight: Int) {
        var newWeight = weight + foodWeight
        print("I am eating $newWeight kgs of food ")
    }
}
//speak(speech: String) :Prints the string passed to it
fun speak(speech: String){
    var speak=speech
    println(speak)
}
// birthday( ) :Increments the human’s age by 1
fun birthday(){
    var newAge=++age
    println(newAge)
}

//Create an instance of this human class and invoke all its functions
//Create a data class User with these fields: firstName, lastName, email,
//phoneNumber, password. Create an instance of User and print out any 2
//attributes
class User(var firstName: String, var lastName: String, var email:String, var phoneNumber:String, var passWord:Int){
    fun info(email: String){
        println("email")
        println("passWord")
        println("firstName")
        println("lastName")

    }
    fun info1(phoneNumber: String){
        println("phoneNumber")

    }
}