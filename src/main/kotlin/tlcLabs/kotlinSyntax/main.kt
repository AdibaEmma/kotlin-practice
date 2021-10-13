package tlcLabs.kotlinSyntax

var funds : Double = 100.0
val pswd = "password"

fun main(args: Array<String>) {

    fun balance() : Unit {
        println(funds)
    }

    fun deposit(amount : Double) : Double {
        return amount
    }

    var input : String
    var cmd : List<String>

    while (true) {
        print("Command: ")
        input = readLine()!!
        cmd = input.split(" ")
        when (cmd[0]) {
            "balance" -> balance()
            "deposit" -> println(deposit(cmd[1].toDouble()))
            else -> println("Invalid command")
        }
    }
    }
