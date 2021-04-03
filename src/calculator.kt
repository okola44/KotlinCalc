fun main() {
    var operations=Calculator()
   println( operations.sum(10,20,30,40))
    println(operations.subtract(20,10))
    println(operations.multiply(30,2))
    println(operations.division(10,3))
    println(operations.modulus(100,3))


}
class Calculator(){
    fun sum(vararg vals:Int ):Int{
        return vals.sum()

    }
    fun subtract(a:Int,b:Int):Int{
        return a-b

    }
    fun multiply(a:Int,b: Int):Int{
        return a*b
    }
    fun division(a:Int,b: Int):Int{
        return a/b
    }
    fun modulus(a: Int,b: Int):Int{
            return a%b
    }
}
