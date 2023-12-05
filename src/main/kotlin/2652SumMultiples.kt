import java.util.Scanner
val Scanner = java.util.Scanner(System.`in`)
fun main(args: Array<String>){
    var sumMultiples = SumMultiples()
    println(sumMultiples.sumOfMultiples(7))
}
class SumMultiples{
    fun sumOfMultiples(n: Int): Int {
        var sum = 0
        for (i in 1..n) {
            if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0)
                sum += i
        }
        return sum
    }
}