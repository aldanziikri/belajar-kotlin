fun toUp(value: String): String = value.uppercase()
fun main() {
    val name = lambda("aldan")
}
val lambda: (String) -> String = ::toUp

