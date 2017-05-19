package begining.classes

/**
 * Created by Geet on 20-05-2017.
 */
//Using `object` keyword implementing Singleton Pattern
// We can create objects without initialising the classes
object Global {
    val PI :Int =  3.14
}
//endregion

//region Main Function
fun main(args: Array<String>) {
    println(Global.PI)
    //creating objects expression format
    var myObject = object {
        val daysInAWeek : Int = 7
    }
    println(myObject.daysInAWeek)
}
//endregion