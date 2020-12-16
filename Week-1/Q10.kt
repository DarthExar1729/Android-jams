fun main(args: Array<String>) {
    print("Enter number or Rows:")
    val rows = readLine()!!.toInt()

    for (i in 1..rows) {
        for (j in 1..i) {
            print("# ")
        }
        println()
    }
}
