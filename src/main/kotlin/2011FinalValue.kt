fun main(args: Array<String>){
    var finalValue = FinalValueOnVariable()
    println(finalValue.finalValueAfterOperations(arrayOf("--X", "X++", "X++")))
}
class FinalValueOnVariable{
    fun finalValueAfterOperations(operations: Array<String>): Int {
        var x = 0
        for (i in operations) {
            when(i) {
                "X++" -> x += 1
                "++X" -> x += 1
                "--X" -> x -= 1
                "X--" -> x -= 1
            }
        }
        return x
    }
}