package My_assignment

//2. A program takes input from user to find what day is today. If today is
//Saturday, display "It is a happy holiday." else "It is a Weekday".

import java.security.acl.AclEntry

fun main(string: Array<String>){
    print("Could you tell me what day is today? :")
    val entry:String = readLine().toString()
    findday(entry.toLowerCase())

}
fun findday(entry:String):String{
    if (entry=="saturday"){
        print("It is a happy holiday")
    }else if (entry=="monday" || entry=="sunday" || entry=="tuesday"
            || entry=="wednesday" || entry=="thursday" || entry=="friday"){
        print("It is a weekday")
    }else
        print("Invalid input")
    return entry
}