package tlcLabs.kotlinSyntax

var funds : Double = 100.0
const val pswd = "password"

fun main(args: Array<String>) {

    fun balance() : Unit {
        println(funds)
    }

    fun deposit(amount : Double)  {
        println("depositing $amount")
        println("$amount has been deposited to your account")
        funds += amount
        println("new balance is $funds")
    }

    fun withdraw(amount: Double) {
        println("Enter password to proceed")
        val input = readLine();

        if(input == pswd) {
            if(amount < funds) {
                val newBalance = funds - amount
                println("$amount has been withdrawn from your account \n Your new balance is $newBalance")
            } else {
                println("You have insufficient balance to make the withdrawal please deposit more")
            }
        } else {
            println("Please enter the correct password")
        }
    }

    var input : String
    var cmd : List<String>

    while (true) {
        print("Command: ")
        input = readLine()!!
        cmd = input.split(" ")
        when (cmd[0]) {
            "balance" -> balance()
            "deposit" -> deposit(cmd[1].toDouble())
            "withdraw" -> withdraw(cmd[1].toDouble())
            else -> println("Invalid command")
        }
    }
    }
