import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class JewelsAndStonesTest{
    private val testJewelsAndStonesTest: JewelsStone = JewelsStone()


    @Test
    fun example1(){
        val result = testJewelsAndStonesTest.numJewelsInStones("aA", "aAAbbbb")
        assertEquals(3, result)
    }

    @Test
    fun example2(){
        val result = testJewelsAndStonesTest.numJewelsInStones("z", "ZZ")
        assertEquals(0, result)
    }
}