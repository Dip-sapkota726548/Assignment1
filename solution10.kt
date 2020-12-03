package My_assignment

// 10.Find all the Odd nos between two nos. (Take input from user)
fun main(string: Array<String>){
    print("Please Enter starting number: ")
    var startnumbers:Int= readLine()!!.toInt()

    print("Please Enter ending number: ")
    var endingnumbers:Int= readLine()!!.toInt()

    findnums(startnumbers,endingnumbers)


}
fun findnums(a:Int,b:Int){
    println("Odd numbers are: ")
    for (i in a..b )
        if(i%2==0) {

        }else
            println("$i")
}