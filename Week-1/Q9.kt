fun main(args: Array<String>) {
    print("Enter the upper limit of the range:")
    val rows = readLine()!!.toInt()
    var a=0
    for (i in 1..rows) {
         if(i%2==0)
             a +=i
    }
    print(a)
}
