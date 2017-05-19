package begining.basics

/**
 * Created by Geet on 19-05-2017.
 */
fun main(args: Array<String>) {

    //region Using var keyword
    //this
    var mobile: Int
    var name: String
    //is same as this also
    //var mobile2
    //var name2
    //but using var this needs to be initialised in manner to get type like this
    //therefore this works
    var mobile3 = 8447276106
    var name3 = "geet"
    //endregion

    //region Using val keyword
    val mobile4 = 8447276106
    val name4 = "gobind"
    //why val came in to account because its like final
    //it cannot change, its immutable
    // therfore
    //mobile4 = 122 and name4 = "singh"
    //will give error
    //but using var keyword we can re-initialise the variable
    mobile3 = 122
    name3 = "Singh"
    //endregion

    //region Using input as variable type information
    val myLong = 10L //for long
    val myInt = 10 //for int
    val myFloat = 10f //for float
    val myDouble = 10.0 //for Double
    val myHex = 0x0f //for hex
    val myBinary = 0xb01 //for binary
    val myString = "alpha" //for binary
    val myChar = 'a' //for char
    //endregion

    //region No implicit conversion in kotlin
    val rank = 1
    //using
    //val score: Long = rank
    //gives type mismatch error
    //therefor explicit helper mehtods are used to achive casting
    val score: Long = rank.toLong()
    //endregion

    //region Typing Easy using Multiline code
    //previous way
    val multiLine = "First Line" +
                    "Second Line" +
                    "Third Line"
    //newer way
    val multipleLines = """
                        First Line
                        Second Line
                        Third Line
                        """
    //endregion

    //region String Manipulations
    val myName = "Geet"
    val hello = "Hello $myName"
    //hello variable prints
    //"Hello geet"
    val lengthOfName = "Length of your name is ${myName.length}"
    //lengthOfName variable prints 4
    //endregion

}