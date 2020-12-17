fun main(args: Array<String>) {
    print("Enter any number:")
    val num = readLine()!!.toInt()
    var origNum: Int
    var rem: Int
    var out = 0
    var n = 0

    origNum = num

    while (origNum != 0) {
        origNum /= 10
        ++n
    }

    origNum = num

    while (origNum != 0) {
        rem = origNum % 10
        out += Math.pow(rem.toDouble(), n.toDouble()).toInt()
        origNum /= 10
    }

    if (out == num)
        println("$num is an Armstrong number.")
    else
        println("$num is not an Armstrong number.")
}
