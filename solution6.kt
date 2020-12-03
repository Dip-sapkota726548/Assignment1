package My_assignment

//6.Display "Sunday" for 1, "Monday" for 2... "Saturday" for 7.
fun main(){
    println("Please enter any number from (1to 7) :")
    val num: Int= readLine()!!.toInt()

    printdays(num)
}
fun printdays(num :Int){
    when(num){
        in 0..1 ->
            print("The showing number is sunday")
        in 1..2 ->
            print("The showing number is monday")
        in 6..7 ->
            print("The showing number is saturday")
        else ->
            print("Inavlid input")
    }
}