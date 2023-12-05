val scanner = java.util.Scanner(System.`in`)
fun main(args: Array<String>) {
    var jewelsStone = JewelsStone()
    println(jewelsStone.numJewelsInStones("aA", "aAAbbbb"))
}
class JewelsStone{
    fun numJewelsInStones(jewels: String, stones: String): Int {
        var num = 0
        for (i in stones) {
            for (j in jewels) {
                if (i == j) {
                    num += 1
                }
            }
        }
        return num
    }
}