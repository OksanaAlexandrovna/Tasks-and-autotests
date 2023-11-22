import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val testSolutionTest: Solution = Solution()

    @Test
    fun testSum(){
        assertEquals(testSolutionTest.sumOfMultiples(7), 21)
    }

    @Test
    fun testSum2(){
        assertEquals(testSolutionTest.sumOfMultiples(7), 25)
    }
}