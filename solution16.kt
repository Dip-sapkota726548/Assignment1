package My_assignment

// 16.Print all the sum of even nos from an array.
fun main(){
    val array3=IntArray(9)
    print("keep on entering numbers: ")
    for(i in array3.indices){

        array3[i]= readLine()!!.toInt()

    }
    addingEven(array3)
}

fun addingEven(array: IntArray){
    println("Sum of even numbers from the above array is: ")
    var c= 0
    for(i in array.indices){
        if(array[i]%2==0){

            c= c + array[i]

        }

    }
    print(c)
}