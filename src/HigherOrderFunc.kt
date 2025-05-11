fun main() {
    fun hello(name:String, transformer: (String) -> String):String{
        return "hello ${transformer(name)}"
    }
    println(hello("aldan", {value:String -> value.uppercase()}))
}