package My_assignment

//7. Convert single digit number to Word. (Hint: 7 to Seven)
fun main(){
    println("Please enter any number to print in words :")
    val num : Int = readLine()!!.toInt()
    convert(num)


}
fun convert (num:Int){
    when(num){
        1 -> print("one")
        2 -> print("two")
        3 -> print("three")
        4 -> print("four")
        5 -> print("five")
        6 -> print("six")
        7 -> print("seven")
        8 -> print("eight")
        9 -> print("nine")
        0 -> print("zero")
        else -> {
            print("Enter single digit number")

        }

    }

}
