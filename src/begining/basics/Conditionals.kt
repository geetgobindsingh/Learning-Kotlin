package begining.basics

/**
 * Created by Geet on 19-05-2017.
 */
fun main(args: Array<String>) {

    //region assigning values usinf if else block
    val myName = "Geet"
    val result = if(myName.equals("")) { // checking myName is not empty
        "Empty"
    } else {
        "Not Empty"
    }
    println(result) // prints Not Empty
    //endregion

    //region Returning different types of values from if else
    val result2 = if(myName.equals("")) {
        10
    } else {
        "Ten"
    }
    println(result2) // prints Ten
    //endregion

    //region Using when Operator (similar to switch)
    //prints "Its a String"
    when(result2) {
        is String -> print("It a String")
        is Int -> print("Its a Integer")
        "Ten" -> print("Its Ten")
        10 -> {
            print("Its 10")
            print("Also a Integer")
        }
    }
    //endregion

    //region expression based when operator
    val result3 = when(result2) {
        is String -> "It a String"
        is Int -> "Its a Integer"
        else -> "Random Thing"
    }
    println(result3)
    //endregion
}