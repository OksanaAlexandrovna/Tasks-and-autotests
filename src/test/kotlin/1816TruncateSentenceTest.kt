import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class TruncateSentances{
    private val testTruncateSentence: TruncateSentence = TruncateSentence()

    @Test
    fun example1(){
        val result = testTruncateSentence.truncateSentence("Hello how are you Contestant", 4)
        assertEquals("Hello how are you", result)
    }

    @Test
    fun example2(){
        val result = testTruncateSentence.truncateSentence("What is the solution to this problem", 4)
        assertEquals("What is the solution", result)
    }

    @Test
    fun example3(){
        val result = testTruncateSentence.truncateSentence("chopper is not a tanuki", 5)
        assertEquals("chopper is not a tanuki", result)
    }
}