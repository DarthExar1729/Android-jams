fun main(args: Array<String>) {
    print("Enter any number:")
    val num = readLine()!!.toInt()

    var fact: Long = 1
    for (i in 1..num) {
        fact *= i.toLong()
    }
    println("$num! = $fact")
}
