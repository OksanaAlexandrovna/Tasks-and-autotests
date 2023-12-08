import java.util.Scanner

val Scanner = java.util.Scanner(System.`in`)
fun main(args: Array<String>) {
  var truncateSent = TruncateSentence()
    println(truncateSent.truncateSentence(("Hello how are you Contestant"),4 ))
}
class TruncateSentence{
    fun truncateSentence(s: String, k: Int): String {
        var newSentence = s.split(' ').take(k).joinToString(" ")
        return newSentence
    }
}