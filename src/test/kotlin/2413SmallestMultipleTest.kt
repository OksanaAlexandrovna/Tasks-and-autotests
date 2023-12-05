import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SmallestMultiple{
    private val testSmallestMultiples: Smallest = Smallest()


    @Test
    fun example1(){
        val result = testSmallestMultiples.smallestEvenMultiple(5)
        assertEquals(10, result)
    }

    @Test
    fun example2(){
        val result = testSmallestMultiples.smallestEvenMultiple(6)
        assertEquals(6, result)
    }

    @Test
    fun example3(){
        val result = testSmallestMultiples.smallestEvenMultiple(1)
        assertEquals(2, result)
    }
}