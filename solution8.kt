package My_assignment

//8.WAP to take monthly salary. Calculate the tax amount if yearly salary
//is.
//1 to 200,000 tax is 1%
//200,000 to 350,000 tax is 1% of first 200,000+15% of remaining salary
//350,000 to above tax is 1% of first 200,000 + 15% of next 150,000 +
//25% of remaining salary
fun main(string: Array<String>){
    print("Please Enter monthly salary: ")
    var salary: Float = readLine()!!.toFloat()
    var a= yearlyfun(salary)
    // print(a)

    var b= taxe(a)
    print(b)
}
fun yearlyfun(monthlySalary:Float):Float{
    var yearly = monthlySalary*12
    return yearly
}
fun taxe(a:Float):Float{
    if (a>1 && a<200000){
        //var calc=(1/100)*a
        print("tax is very few")
    }else if (a>200000 && a<350000) {
        print("tax is medium")
    }else
        print("tax is high")
    return a
}

