package tlcLabs

fun calculateY(m : Int, x : Int, c : Int) : Int {
    // y = mx + c - formula for a straight line
    return m * x + c
}
fun main(args: Array<String>) {
//    for (i in 0..20) {
//        if (calculateY(3, i, 5) == calculateY(4, i , 2))
//            println("x = $i \n y = " + calculateY(4, i, 2))
//    }

//    intersection(3, 5, 4, 2)
//    intersection(2, 1, 3, 3)
    intersection(-2, 3, 3, -2)
}

fun intersection(mOne : Int, cOne : Int, mTwo : Int, cTwo : Int) : Unit {
    // This function takes the equations of two lines:
    // yOne = mOne * x + cOne and yTwo = mTwo * x + cTwo
    // and prints the X value they intersect at
    // or prints "Don't intersect" if they do not.
    // You only need to check x values between 0 and 100

    for (i in 0..100) {
        if (calculateY(mOne, i, cOne) == calculateY(mTwo, i , cTwo)) {
            println("lines y=$mOne * $i + $cOne and y=$mTwo * $i + $cTwo intersects at x = $i")
        } else {
            println("Don't intersect")
        }
    }
}