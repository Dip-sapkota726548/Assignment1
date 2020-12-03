package My_assignment
//3. Find whether user inputs positive or negative number or zero.
fun main(){
    println("Please enter the number :")
    val num : Int = readLine()!!.toInt()
    output(num)
}
fun output (num : Int){
    if(num > 0){
        println("It is positive number ")
    }
    else{
        if( num ==0){
            println("it is Zero")
        }
        else{
            println("it is negative number")
        }
    }
}