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
}