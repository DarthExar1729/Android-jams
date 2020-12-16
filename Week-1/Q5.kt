fun main(arg: Array<String>) {
    print("Enter 3 sides of a triangle:")
    var s1= readLine()!!
    var side1: Int = s1.toInt()
    var s2= readLine()!!
    var side2: Int = s2.toInt()
    var s3= readLine()!!
    var side3: Int = s3.toInt()
    println("$side1 $side2 $side3")
    if (side1==side2 && side1==side3)
        println("Eqi Tri")
    else if (side1==side2 || side1==side3 || side2==side3)
        println("Iso tri")
    else
        println("Scal tri")
}
