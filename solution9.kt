package My_assignment

//9. Find all the Even nos between two nos. (Take input from user)

fun main(string: Array<String>){
    print("Please Enter starting number: ")
    var startnumber:Int= readLine()!!.toInt()

    print("Please Enter ending number: ")
    var endingnumber:Int= readLine()!!.toInt()

    findnum(startnumber,endingnumber)


}
fun findnum(a:Int,b:Int){
    print("Even numbers are: ")
    for (i in a..b )
        if(i%2==0) {
            println("$i")
        }
}