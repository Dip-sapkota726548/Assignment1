package My_assignment

// 14.Print all the even nos from an array.

fun main(){

    val array1=IntArray(9)
    print("keep on entering numbers: ")
    for(i in array1.indices){

        array1[i]= readLine()!!.toInt()

    }
    displayingEven(array1)
}

fun displayingEven(array: IntArray){
    println("Even numbers are: ")
    for(i in array.indices){
        if(array[i]%2==0){
            println(array[i])
        }
    }
}