// fun main(){
//     var grade: Array<Int> = arrayOf(20, 40, 60, 25, 57, 68)
//     grade[2] = 700
//     grade[1] = grade[4] + grade[0]


//     print("[ ")
//     for(i in grade){
//         print("$i, ")
//     }
//     print(" ]\n")
// }
    // var sum = 0
    // grade.forEach { it -> 
    //     sum += it
    // }

    // println("Sum: $sum")

// fun main() {
//         val arr: Array<Int> = Array(4){0}
//         print("Please enter 4 integers: ")
//         var i = 0
//         while (i < 4) {
//             var j = readln().toInt()
//             arr[i] += j
//             print("Values in arry are Now: ")
//             print(" ${arr[i]}")
//             println()
//             i++
//         }

//         print("Final List: [ ")
//         for (i in arr){
//             print("$i, ")
//         }
//         print("]\n")
// }

// fun main(){
//     var grade: Array<Int> = arrayOf(20, 40, 60, 25, 57, 68)
//     grade[2] = 700
//     grade[1] = grade[4] + grade[0]

//     println(sum(grade, 5))

//     // print("[ ")
//     // for(i in grade){
//     //     print("$i, ")
//     // }
//     // print(" ]\n")
// }

// fun sum(arr: Array<Int>, l: Int): Int {
//     var sum = 0
//     if(arr.size == l){
//         arr.forEach { it -> 
//             sum += it
//         }
//     }else{
//         return sum
//     }
//     return sum
// }


fun main() {
    // var twoDimArray: Array<IntArray> = Array(2) { IntArray(4) };
    // var twoDimArray: Array<Array<Int>> = arrayOf(arrayOf(2, 4, 6, 8), arrayOf(3, 5,7, 8));

    // twoDimArray[0][0] = 6;
    // twoDimArray[0][1] = 0;
    // twoDimArray[0][2] = 9;
    // twoDimArray[0][3] = 6;
    // twoDimArray[1][0] = 2;
    // twoDimArray[1][1] = 0;
    // twoDimArray[1][2] = 1;
    // twoDimArray[1][3] = 1;
    // print("[ ")
    // for (i in twoDimArray.indices) {
    //     print("[ ")
    //     for (j in twoDimArray[i].indices) {
    //         print("${twoDimArray[i][j]}, ")
    //     }
    //     print(" ]")
    //     println(" ]")
    // }

    // var name: String = "John Smith"
    // println(name.lowercase())
    // println(name.uppercase())
    // var result = name.split(" ")
    // println(result[0])

    // name.forEach{ it -> println(it)}

    print("Enter your username: ")
    var u = readln().toString()

    print("Enter your your password: ")
    var p = readln().toInt()
    login(u, p)
}

fun login(usrname: String = "Guest", pwd: Int){
    if(usrname.lowercase() == "john" && pwd == 1234){
        println("John your are now logged in!")
    }else{
        println("Welcome $usrname")
        println("You don't have an account!")
    }
}