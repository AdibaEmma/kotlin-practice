fun main(args: Array<String>) {
    var a = 1;
    var b = true;
    var c = 1;

    var result : Int
    var booleanResult : Boolean

    result = -a;
    println("-a = $result")

    booleanResult = !b;
    println("!b = $booleanResult")

    result = --c;
    println("--c = $result");
}