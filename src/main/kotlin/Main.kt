fun main(){
    print("Enter the Width: ")
    var width: Int = readln().toInt()

    print("Enter the Height: ")
    var height: Int = readln().toInt()

    print("Enter the Character: ")
    var char: String = readln()

    drawBoxes(width, height, char)
}

fun drawBoxes(width: Int, height: Int, char: String){
    drawLines(char, width)
    for (i in 1..height - 2){
        print(char)
        drawLines(" ", width - 2)
        print("$char\n")
    }
    drawLines(char, width)
}

fun drawLines(character: String, length: Int){
    for (i in 1..length){
        print(character)
    }
    print("\n")
}