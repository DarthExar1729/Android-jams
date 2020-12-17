fun main(args: Array<String>) {
    print("Enter any integer:")
    val num = readLine()!!.toInt()
    var origNum: Int
    var rem: Int
    var out = 0

    origNum = num

    while (origNum != 0) {
        rem = origNum % 10
        out += Math.pow(rem.toDouble(), 3.0).toInt()
        origNum /= 10
    }

    if (out == num)
        println("$num is an Armstrong number.")
    else
        println("$num is not an Armstrong number.")
}
