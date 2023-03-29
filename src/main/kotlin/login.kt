fun login(usrname: String = "Guest", pwd: Int){
    if(usrname.compareTo("John") && pwd == 1234){
        println("John your are now logged in!")
    }else{
        println("Welcome $usrname")
        println("You don't have an account!")
    }
}