fun main(args: Array<String>) {
    print("Enter a number: ")
    val n = readLine()!!.toInt()
    var sum: Int = 0
    for (k in 1..n) {
        var j: Int = 1
        for (i in 1..k) {
            j = j * i
        }
        println(j)
        sum = sum + j
    }
    println(sum)
}
