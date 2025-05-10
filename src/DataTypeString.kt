fun main() {
    var firstName = "aldan"
    var lastName = "zikri"
    var fullName = """
        nama saya $firstName $lastName
        tinggal di jambi
    """

    println(fullName.trimIndent())


//    trim margin
    var text = """
        |nama saya $firstName $lastName
        |tinggal di jambi
    """

    println(text)
}
