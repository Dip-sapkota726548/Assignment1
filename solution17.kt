package My_assignment

// 17. Print the greatest and lowest number from an array.
fun main(){

    val array4=IntArray(9)
    print("keep on entering numbers: ")
    for(i in array4.indices){

        array4[i]= readLine()!!.toInt()
        //println(array1[i])
    }
    comparearray(array4)
    mincomparearray(array4)
}

fun comparearray(array: IntArray){
    print("Maximum number from the above array is: ")


    var max=array[0]

    for (i in array.indices){
        if (array[i]>max)
            max=array[i]
    }
    print("$max and ")

}
fun mincomparearray(array: IntArray){
    print("Minimum number from the above array is: ")


    var min=array[0]

    for (i in array.indices){
        if (array[i]<min)
            min=array[i]
    }
    print(min)

}


