fun main(args: Array<String>) {
    val mood = "Happy";
    val activity = "coding";
    val time = "this morning";

    println(mood + " " +  activity + " " + time); // normal concatenation
    println("$mood $activity $time") // string templating
}