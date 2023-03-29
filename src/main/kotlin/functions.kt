fun sum_loop(num: Int){
    print("Enter Numbers: ")
    var num = readln().toInt()
    var sum = 0

    while(num != -2){
        sum += num
        print("Enter another Numbers: ")
        num = readln().toInt()
    }

    println("Sum: $sum")
}

fun pirma(){
    for(i in 0..5){
        for(j in 0 .. 5 - i){
            print("*")
        }
        for(j in 0..i){
            if(j == 0){
                continue
            }
            print(".")
        }
        print("\n")
    }
}