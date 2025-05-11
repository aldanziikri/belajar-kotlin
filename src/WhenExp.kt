fun main() {
    val nilai = 96

    when (nilai){
        in 90..100 -> println("sangat baik")
        in 80..89 -> println("baik")
        in 70..79 -> println("cukup baik")
        else -> println("tidak ada nilai")
    }
    when {
        nilai is String -> println("str")
        nilai is Int -> println("int")
        else -> println("tidak ada nilai")
    }
}