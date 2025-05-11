

fun main() {

    fun hello(nama: String? = "aldan", vararg nilais:Int): String {
        var total = 0
        for (nilai in nilais){
            total += nilai
        }

        return "total nilai $nama adalah $total"
    }
    println(hello("aldan",43,34,21))
}
