import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SumMultiplesTest{
    private val testSumMultiples: SumMultiples = SumMultiples()


    @Test
    fun examples1(){
        val result = testSumMultiples.sumOfMultiples(7)
        assertEquals(21, result)
    }

    @Test
    fun examples2(){
        val result = testSumMultiples.sumOfMultiples(10)
        assertEquals(40, result)
    }

    @Test
    fun examples3(){
        val result = testSumMultiples.sumOfMultiples(9)
        assertEquals(30, result)
    }

    @Test
    fun examples4(){
        val result = testSumMultiples.sumOfMultiples(5)
        assertEquals(8, result)
    }
}