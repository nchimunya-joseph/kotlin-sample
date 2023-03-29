fun sum(vararg args: Int): Int{
    var sum = 0
    for (i in args){
        sum += i
    }
    return sum
}