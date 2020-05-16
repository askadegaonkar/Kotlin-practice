fun main(args: Array<String>) {
    var a: Int = 5   //Mutable type
    val b: Int = 3   //Immutable type
    println("The value of a is: $a")  //String template
    println("The value of b is: $b")

    // - Single line comment in kotlin

    /*
    *Multiple line comment
    */

    //Operations
    val num1: Int = 5
    val num2: Int = 3
    println("The value of num1 is: $num1")
    println("The value of num2 is: $num2")
    var ans = num1.plus(num2)
    //Call methods on numbers
    println("Sum is: $ans")
    ans = num1 - num2
    println("Subtraction is: $ans")
    println("Multiplication is : ${num1 * num2}")
    ans = (num1 / num2)
    val ans1: Double = ans.toDouble()
    println("Div is: $ans1")

    /*Conditional statements: if,if..else,if..else if..else,
     when (more advance version of switch)*/
    println("Enter a value: ")
    val num3: String = readLine()!!
    println("Enter a value: ")
    val num4: String = readLine()!!
    num3.toInt()
    num4.toInt()
    if (num3 > num4) {
        println("Bigger number is:$num3")
    } else {
        println("$num4 is bigger")
    }

    val numberofFish: Int = 30
    when (numberofFish) {
        0 -> println("No fish")
        in 1..20 -> println("Some fishes")
        else -> println("Many fishes")
    }


}