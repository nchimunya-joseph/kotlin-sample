
// fun main() {
//     println(sum(20, 40, 30 ,20, 16, 49, 29))

//     val y = {a: Int, b: Int -> a * b}
//     val username = {usr: String -> "Hello $usr"}
//     println(username("Smith"))
    
//     println(y(20, 3))
// }

fun sum(vararg x: Int): Int {
    var sum = 0
    for(i in x){
        sum = sum + i
    }
    return sum
}