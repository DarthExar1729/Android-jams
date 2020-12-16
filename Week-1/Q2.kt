fun main(arg: Array<String>) {
    print("Enter 3 Numbers:")
    var a= readLine()!!.toInt()
    var b= readLine()!!.toInt()
    var c= readLine()!!.toInt()
    println("Given input:($a,$b,$c)")
    if (a>b && a>c)
        println("$a is the greatest.")
    else if (b>a && b>c)
        println("$b is the greatest.")
    else
        println("$c is the greatest.")
}
