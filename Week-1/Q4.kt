fun main(arg: Array<String>) {
    print("Enter any Integer:")
    var a= readLine()!!.toInt()
    if (a%5==0 && a%11==0)
        print("$a is divisible by 5 & 11.")
    else
        print("$a is not divisible by 5 & 11.")
}
