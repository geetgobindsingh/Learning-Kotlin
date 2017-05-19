package begining.classes

/**
 * Created by Geet on 19-05-2017.
 */

//region Using `data` keyword before class will help class in many ways like
//create nice toString for class
//creates hashCode and equal method for object comparision
//override methods
// copy method for copying object and more functionality
//similar as Java Beans concept
data class Student(var studentId: String, var name: String, var rollNumber: Int) {
    override fun toString(): String { // getting in form of JSON
        return "{\"studentId\" : \"$studentId\", \"name\" : \"$name\", \"rollNumber\" : $rollNumber}"
    }
}
//endregion

//region Main Function
fun main(args: Array<String>) {
    var student1 = Student("S01", "Geet", 1)
    var student2 = Student("S01", "Geet", 1)
    println(student1.toString())
    if(student1 == student2) {
        println("Both are same student")
    }
    //using Copy for Overriding previous object values
    var student3 = student1.copy(studentId = "S02")
    println(student3.studentId)
}
//endregion

