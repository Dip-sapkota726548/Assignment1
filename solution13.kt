package My_assignment

// 13. Write a program display the pattern like right angle triangle
//using an asterisk.
//e.g. Input number of rows: 5
//*
//**
//***
//****
//*****

fun main(){
    print("Please Enter a number :")
    val rows:Int = readLine()!!.toInt()
    asterisk(rows)
}
fun asterisk(rows:Int){
    for (i in 1..rows){
        for (j in 1.. i){
            print("* ")
        }
        println()
    }
}
