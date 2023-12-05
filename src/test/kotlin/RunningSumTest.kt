import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class RunningSumTest{
    private val testRunningSumTest: RunningSum = RunningSum()

    @Test
    fun example1(){
        val result = testRunningSumTest.runningSum(intArrayOf(1, 2, 3, 4))
        assertArrayEquals(intArrayOf(1, 3, 6, 10), result)
    }

    @Test
    fun example2(){
        val result = testRunningSumTest.runningSum(intArrayOf(1, 1, 1, 1, 1))
        assertArrayEquals(intArrayOf(1, 2, 3, 4, 5), result)
    }

    @Test
    fun example3(){
        val result = testRunningSumTest.runningSum(intArrayOf(3, 1, 2, 10, 1))
        assertArrayEquals(intArrayOf(3, 4, 6, 16, 17), result)
    }
}
