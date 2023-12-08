import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class FinalValue{
    private val testFinalValue: FinalValueOnVariable = FinalValueOnVariable()

    @Test
    fun example1(){
        val result = testFinalValue.finalValueAfterOperations(arrayOf("--X","X++","X++"))
        assertEquals(1, result)

    }
    @Test
    fun example2(){
        val result = testFinalValue.finalValueAfterOperations(arrayOf("++X","++X","X++"))
        assertEquals(3, result)

    }
    @Test
    fun example3(){
        val result = testFinalValue.finalValueAfterOperations(arrayOf("X++","++X","--X","X--"))
        assertEquals(0, result)

    }
}