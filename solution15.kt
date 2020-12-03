package My_assignment

// 15.Print all the odd nos from an array.
fun main(){
    val array2=IntArray(9)
    print("keep on entering numbers: ")
    for(i in array2.indices){

        array2[i]= readLine()!!.toInt()
        //println(array1[i])
    }
    displayingOdd(array2)
}

fun displayingOdd(array: IntArray){
    println("Odd numbers are ")
    for(i in array.indices){
        if(array[i]%2!=0){
            println(array[i])
        }
    }
}