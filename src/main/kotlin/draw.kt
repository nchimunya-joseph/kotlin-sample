// fun main() {
//     print("Enter width: ")
//     var x: Int = readln().toInt()

//     print("Enter Hieght: ")
//     var y: Int = readln().toInt()

//     print("Enter character: ")
//     var char: String = readln()

//     drawBox(x, y, char)
// }

fun drawBox(width: Int, height: Int, char: String){
    //top line
    lines(width, char)
    //middle line
    for (i in 1..height) {
        print(char)
        for (j in 1..width - 2) {
            print(" ")
        }
        print(char)
        print("\n")
    }
    //bottomLine
    lines(width, char)
}

fun lines(length: Int, char: String){
    for (i in 1..length) {
        print(char)
    }
    print("\n")
}