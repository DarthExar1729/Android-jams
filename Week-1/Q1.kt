fun main(arg: Array<String>) {
    print("Enter any Number:")
    var a= readLine()!!.toInt()
    println("$a")
    if (a<0)
        println("$a is Negative.")
    else if (a>0)
        println("$a is Positive.")
    else
        println("$a is 0.")
}
