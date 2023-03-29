fun get_username() {
    print("Enter a num: ")
    var x: Int = readln().toInt();
    var sum: Int = 0
    while (x != -1) {
        sum += x
        print("Enter a num: ")
        x = readln().toInt()
    }
    println("Sum: $sum")
}