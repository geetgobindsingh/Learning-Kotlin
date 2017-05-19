package begining.classes

/**
 * Created by Geet on 20-05-2017.
 */
//region Using enum keyword to make class behave as enum
enum class Day {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY
}
//endregion

//region Adding enum key value feature
enum class Season(val value: Int) {
    WINTER(1),
    SUMMER(2){
        override fun toString(): String {
            return "GARMI"
        }
    },
    AUTUMN(3),
    SPRING(4)
}
//endregion

//region Main Function
fun main(args: Array<String>) {
    var day = Day.MONDAY
    println(day) // prints MONDAY
    var season = Season.SUMMER
    println(season)
    println(season.value)
    println(season.toString())
    println(Season.SUMMER.ordinal) // prints 1 as surrogate ranking value which starts from 0
    //printing all values of a enum
    for(season in Season.values()) {
        println(season)
    }
    println(Season.valueOf(Season.SUMMER.name).value) //returns value

}
//endregion