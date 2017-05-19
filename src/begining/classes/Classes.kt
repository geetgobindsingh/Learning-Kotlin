package begining.classes

import java.util.*

/**
 * Created by Geet on 19-05-2017.
 */
//region Creating Class objects
class User {
    var name: String = "" //Only support properties
    var mobile: String = "" //there is no fields
}

class Mobile(cCode: Int, var number: Long) {
    var countryCode: Int = cCode //initialising through constructor
}

class Name(var first: String, var last: String)  // creating properties from constructors
//see while doing above type simple class we can remove parentheses
//endregion

//region Using init block in class
// inside init code runs just after object is created of that class
class Entry(var entryName: String = "first") {
    init {
        entryName = entryName.toUpperCase() // this will convert to upper case string
    }
}
//endregion

//region Creating multiple constructors
class Fan(var handsCount: Int) { // base/primary constructor
    var company: String = ""
    init {
        println("From Init")
        println("Hands count is: $handsCount")
    }
    constructor(companyName: String) : this(3) {  // Secondary constructor
        company = companyName
        println("From Secondary Constructor")
        println("Fan company $company and hands count is $handsCount")
    }
}
//endregion

//region Using getters and setters in Kotlin class
class Timeline(val yearOfBirth: Int) {
    val age: Int
            get() = Calendar.getInstance().get(Calendar.YEAR) - yearOfBirth
    var name: String = "Geet"
            set(value) {
                if(value == null || value.length == 0) {
                    throw Exception("name cannot be null or of length 0") // we can use some condition while setting
                }
                field = value // here field is a keyword used to initializing name
            }
}
//endregion

//region Creating functions inside class
class Batch(val numberOfStudents: Int) {
    fun getStudentsCount() = numberOfStudents
}
//endregion

//region Visibility Modifiers in Kotlin
// Four Visibility modifiers are:
// public - is default and accessible everywhere
// private - available inside file containing declaration and only available to class members
// internal - anywhere in same module
// protected - same as private and visible in subclassesg
//endregion

//region Main Function
fun main(args: Array<String>) {
    //creating User object
    var user = User()
    // initialising object partially by constructor and adding variable
    var mobile = Mobile(0, 8447276106)
    println("Country code is ${mobile.countryCode} and number is ${mobile.number}")
    //No need of `new` keyword for objection creation
    var name = Name("Geet Gobind", "Singh")
    println("first namne: ${name.first} last name: ${name.last}.")
    // Using init for acting after object creation
    var entry = Entry("Work")
    println("${entry.entryName}")
    // Using secondary constructor
    var fan = Fan("Khaitan")
    println("${fan.company} have ${fan.handsCount} hands")
    var timeline = Timeline(1992)
    //timeline.name = "" will throw exception
    println("Age is ${timeline.age} and name is ${timeline.name}")
    //calling member methods of a class
    var batch = Batch(50)
    println("Students in a batch are ${batch.getStudentsCount()}")
}
//endregion