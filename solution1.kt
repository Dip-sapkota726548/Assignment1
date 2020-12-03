package My_assignment

//1. WAP which takes whole number. Find whether it is greater than 100
//or not.
    fun main(){
    println("Please enter the whole number :")
    val num : Int = readLine()!!.toInt()
    greater(num)
    }

    fun greater(num: Int){
        if(num < 100){
            println("The showing Number is less than 100!\n");
        }
        else{
            if(num == 100){
                println("Number is 100!!\n");
            }
            else{
                println("The showingn Number is greater than 100!\n");
            }
        }
    }

