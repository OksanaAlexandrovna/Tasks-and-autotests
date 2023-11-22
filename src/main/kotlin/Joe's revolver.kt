import java.util.*

fun main(args: Array<String>) {
    println()
}
class JoeRevolver {
    fun getMaxPrice(assortment: Int, cashJoe: Int): Int {
        val revolverPrice: Array<Int> = arrayOf(3, 10, 300, 15, 3) // a1,a2...an
        var maxPrice = 0
        for (i in 0 until revolverPrice.size) {
            if (revolverPrice[i] <= cashJoe && revolverPrice[i] > maxPrice) {
                maxPrice = revolverPrice[i]
            }
        }
        return maxPrice
    }
}