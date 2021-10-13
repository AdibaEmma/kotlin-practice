fun main(args: Array<String>) {
    val number1 = 12.5
    val number2 = 3.5
    var result: Double

    result = number1 + number2
    println("number1 + number2 = $result")

    result = number1 - number2
    println("number1 - number2 = $result")

    result = number1 * number2
    println("number1 * number2 = $result")

    result = number1 / number2
    println("number1 / number2 = $result")

    result = number1 % number2
    println("number1 % number2 = $result")



    result = number1.plus(number2)
    println("number1 + number2 = $result")

    result = number1.minus(number2)
    println("number1 - number2 = $result")

    result = number1.times(number2)
    println("number1 * number2 = $result")

    result = number1.div(number2)
    println("number1 / number2 = $result")

    result = number1.mod(number2)
    println("number1 % number2 = $result")
}