fun main() {
//    ageClassifier(27)
    ageModifier(1)
    ageModifier(8)
    ageModifier(19)
    ageModifier(56)
    haveYouBeen("Tanzania")
    println(carryPeople(6))
    println()
//    println(mixedTyeArr(arrayOf("Hopper",33,26.5,"Avacado",2,30.6)))






}
//fun ageClassifier(age:Int){
////    if(age>12 .. age <19){
////        println("You are a teenager")
//    }
//    else{
//        println("You are not a teenager")
//    }
//}
//Baby1,Toddler2-3,Child,Adult,Retire 60
fun ageModifier(age: Int){
    if(age>0 && age<1){
        println("you are a baby")
    }
    else if(age <2 && age >3){
        println("you are a toddler")


    }
      else if(age <4 && age<17) {
          println("you are a child")
        }
        else if(age<18 && age<59){
            println("you are an adult")
        }
        else{
            println("you are an adult")
        }
    }

fun haveYouBeen(nationality:String){
    when(nationality){
        "Kenyan" ->println("Have you been in Nairobi?")
        "Rwanda" -> println("Have you been in Kigali?")
        "Tanzania" ->println("Have you been in Dodoma?")
        "Sudan" ->println("Have you been in Khartoum?")
        "Uganda" ->println("Have you been in Kampala")
        else ->println("Have you been to East Africa?")
    }
}
//write a function that take in an integer representing the
//number of passengers a vehicle can seat,typically between 2 and 7
//classifies the vehicle as
//coupe 2 seater
//sedan 4-5 seater
//wagon above 5 seater
fun carryPeople(people:Int):String{
    when(people){
        2-> return "Coupe"
        4,5->return "sedan"
        6,7->return "wagon"
        else->return "others"

    }
}
// write  a function that takes in an array of random integers
//and prints out whether each is odd or even

fun numbers(numbers:Array<Int>){
    for(numbers in numbers){

}
}
//Write a function that takes in an array of mixed types
//and returns the sum of all the decimal elements

fun sumArray(nums:Array<Int>):Int{
    var sum =0
    for(nums in nums){
        sum+=nums

    }

    return sum
}

//
//fun mixedTyeArr():Double{
//    var sum = 0.0
////    for(elements in array){
//        if(elements is Double){
////            sum += element
//        }
//    }
//    return  sum
//}










