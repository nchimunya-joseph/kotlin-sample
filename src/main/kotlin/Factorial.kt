fun factorial(x: Int): Int{
    if(x == 1) return x
    return x * factorial(x - 1)
}