package My_assignment

// 18.  //Create a Dictionary app using mapOf() function where
//    // user will type a word and your program should return the meaning of that word.

fun main(){

    println("THis is a dictionary app")
    dicttest()

}
fun dicttest(){

    val diction = mapOf(
            "function" to "A function is a combination of instructions that are combined to achieve some result. ",
            "class" to "A class is a blueprint of an object.",
            "object" to "Objects can communicate with well-defined interfaces called messages.",
            "Array" to "An array is a data structure consisting of a collection of elements (values or variables), each identified by at least one array index or key."


    )
    println("Find meanings of these words: ${diction.keys} ")
    println("What do you want to know about? ")
    val meaningg= readLine()!!

    println("${diction[meaningg]}")

}
