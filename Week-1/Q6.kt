fun main(args: Array<String>) {
    print("Enter Anything:")
    val x = readLine()!!.single()

    if (x in 'a'..'z' || x in 'A'..'Z')
        println("$x is an alphabet.")
    else
        println("$x is not an alphabet.")
}
