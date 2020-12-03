package My_assignment

// 12. Write a program to display the multiplication table of a given
//integer value.

fun main(string: Array<String>) {
    print(" Please Enter a number: ")
    val num = readLine()!!.toInt()
    multiplicationtable(num)




}
fun multiplicationtable(num:Int){
    for (i in 1..10){
        val product = num  * i
        println("$num * $i = $product")
    }

}