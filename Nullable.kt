/*Nullable

By default,variables cannot be nullable
var a: Int =null - X

But in Kotlin we can assign null value without getting null pointer exception
with help of '?'

*/
fun main(args: Array<String>) {
    var a: Int? = null
    println("$a")
    //Non-null
    println("Enter string: ")
    val input1: String = readLine()!!
    println("Your input: $input1")

    /*Elvis operator: f the expression to the left of ?: is not null,
     the elvis operator returns it, otherwise it returns
     the expression to the right.Note that the right-hand side expression
     is evaluated only if the left-hand side is null.*/

    val input2:String= "Atharva"
    val l=input2?.length?:"Zero length"
    println(l)
}