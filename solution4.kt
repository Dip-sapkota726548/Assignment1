package My_assignment

// 4.WAP to take monthly salary. If yearly salary is above 200,000 then
//display “You have to pay tax” otherwise display “You don’t have to pay
//tax.”

fun main(string: Array<String>){
    print("Please Enter your salary: ")
    val salary:Float = readLine()!!.toFloat()
    tax(salary)
    print("$salary")
}

fun tax(salary: Float):String{
    val t:String = "You have to pay tax for: "
    val n:String = "You don't have to pay tax for "

    if (salary>=200000){
        print(t)
    }else
        print(n)
    return t;n
}