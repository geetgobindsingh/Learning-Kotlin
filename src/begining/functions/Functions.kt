package begining.functions

/**
 * Created by Geet on 19-05-2017.
 */
 //region Main Function for calling other function
fun main(args: Array<String>) {
    hello()
    println(getMeFour())
    println(add(2,4))
    println(sum(1,2))
    println(sum(1,2,3))
    println(getDetails("Geet", mobile = "+91 99 99 99 99 99"))
    getAlphabets("a")
    getAlphabets("a", "b")
    getAlphabets("a", "b", "c")
    sendAlphabets("a", "b")
    sendAlphabets("a", "b", "c")
    throwsException()
}
//endregion

//region Returning Unit in place of void(in java)
//by default the return type is Unit
// If you want to return void type value
// from a function like in java
//in Kotlin use `Unit` for this
fun hello() : Unit {
    println("Hello")
}
//endregion

//region Using Nothing as return type
//Similarly if we want to throw exception
//in Kotlin we use `Nothing` for return type
fun throwsException() : Nothing {
    throw Exception("This Method Throws Exception")
}
//endregion

//region Returning value with return type specified
//We can return values also
fun getMeFour() : Int {
    return 4
}
//endregion

//region Returning value without return type specified
//also we can remove the return type since
//also referred as single expression funcitons
//compiler can reference it by itself too
fun add(a: Int, b: Int) = a + b
//endregion

//region Using Default parameter values
//reduced overloading of methods
fun sum(a: Int, b: Int, c: Int = 0) = a + b + c
//this method can be used in two ways
//sum(1,2) and sum(1,2,3)
//one with two and other with three arguments
//endregion

//region Using Named Parameters in argument
fun getDetails(name: String, email: String = "blank@blank.com", mobile: String): String {
    return "Name is $name, email is $email and mobile is $mobile"
}
//We want to call getDetails by sending only name and mobile as argument
// and want the email to print its default value
//we will name the argument to its parameter of function
//which helps to remove ambiguity of parameter passed to relative argument
// getDetails("Geet", mobile = "+91 99 99 99 99 99")
//endregion

//region Named parameter ordering
//we can also send arguments in any order if named
// getDetails(mobile = "+91", email = "kotlin@kotlin.com", name = "Geet")
//endregion

//region Using varargs for any number of arguments of same type
fun getAlphabets(vararg values: String)
{
    for(value in values) {
        println(value)
    }
}
// getAlphabets("a")
// getAlphabets("a", "b")
// getAlphabets("a", "b", "c") and more
//endregion

//region Sending vargargs as argument to a function
//using `*` operator
fun sendAlphabets(vararg strings: String) {
    getAlphabets(*strings)
}
//endregion