package My_assignment

//5. WAP to find child, young, old or invalid input.
fun main(){
    println("Please enter your age :")
    val age : Int = readLine()!!.toInt()
    findage(age)
}
fun findage(age : Int){
    when(age){
        in 0..0 ->
            print("Invalid input")
        in 1..5 ->
            print("You are in child group")
        in 6..10 ->
            print("you are in young category")
        in 20..50 ->
            print("You are in adult group")
        else ->
            print("You are in old age")
    }
}