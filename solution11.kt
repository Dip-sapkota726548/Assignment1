package My_assignment

// 11.Find all the Sum of even nos between two nos. (Take input from
//user)

fun main(string: Array<String>){
    print("Please Enter starting number: ")
    var startnumberss:Int= readLine()!!.toInt()

    print("Please Enter ending number: ")
    var endingnumberss:Int= readLine()!!.toInt()

    findnumss(startnumberss,endingnumberss)


}
fun findnumss(a:Int,b:Int){
    println("Even numbers are: ")
    var c=0
    for (i in a..b )
        if(i%2==0) {
            print("$i, ")
            c=c+i

        }
    println("Sum of even numbers are $c")
}