val Scan = java.util.Scanner(System.`in`)

fun main(array: Array<String>){
    var smallest = Smallest()
    println(smallest.smallestEvenMultiple(5))
}

class Smallest{
    fun smallestEvenMultiple(n: Int): Int {
        if (n % 2 == 0) {
            return n
        } else {
            return n*2
        }
    }
}