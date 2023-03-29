fun looper() {
    var i = 1
    var j = 1
    while (i <= 5) {
        while (j <= 6 - i) {
            print("#")
            for (j in 1..i) {
                print("#")
            }
            println()
        }
        println()
        i += 1
    }
}