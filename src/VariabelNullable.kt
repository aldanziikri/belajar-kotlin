const val APP_NAME = "Belajar-Kotlin"

fun main() {
    val x = "aldan zikri"
    var y = "aldan zikri"
//    x = "zikri"
    y = "aldan"

    //nullable

    var name: String? = null
    name = "zikri"
    println(name?.length)
    println(APP_NAME)

    val users: Array<String> = arrayOf("aldan", "intan", "zikri", "nabil")
    val usersNull: Array<String?> = arrayOfNulls(3)
    println(users[1])
//    println(users.set(2, "nabila"))
    println(users[2])
    println(users.size)

    //range
    val range = 100 downTo  1
    println(range)
    println(range.count())
    println(range.last)
    println(range.first)
    println(range.contains(200))
    println(range.step)
}