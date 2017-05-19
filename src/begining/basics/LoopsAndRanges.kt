package begining.basics

/**
 * Created by Geet on 19-05-2017.
 */
fun main(args: Array<String>) {

    //region For loop using Range Operator
    for (a in 1..100) {
        //here it loops from 1 to 100
        //".." between number is a rangeTo function Operator
    }

    for (a in 100..1) {
        //here it loops from 100 to 1
    }
    //similarly
    for (a in 100 downTo 1) {
    }

    val myRange = 1..100
    for (a in myRange) {
        //loops from 1 to 100
        //here myRange is a list/array of numbers from 1 to 100
    }
    //endregion

    //region Using step operator also
    for (a in myRange step 5) {
        print(a) // will print in series like 1 6 11... and so 5 step difference
    }
    //endregion

    //region Creating List using listOf Operator
    val states = listOf("Delhi", "Mumbai", "Kerela")
    for(state in states) {
        println(state)
    }
    //endregion

    //region While and Do While Loop
    var limit = 10
    while(limit > 0) {
        limit--
    }

    do{
        limit++
    }while(limit >10)
    //endregion

    //region breaking outer loops by labeling loops
    label@ for (a in 1..10) {
        for(b in 1..10) {
            if(a > b) {
                break@label
            }
        }
    }
    //endregion
}