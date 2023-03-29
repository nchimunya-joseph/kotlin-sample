// fun main() {
//     print("Guess a Number: ")
//     val g = readln().toInt()
//     random_numbers(g)
// }

fun random_numbers(guses: Int){
    val y = 10
    var i = 0
    while(i < 5){
        if(guses == y){
            println("You Won!")
            break
        }else{
            println("You Lose!")
            print("Guess a Number: ")
            val g = readln().toInt()
        }
        i++
    }
}