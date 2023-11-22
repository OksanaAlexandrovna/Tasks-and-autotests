import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class JoeRevolverTest{
    private val testJoeRevolverTest: JoeRevolver = JoeRevolver()

    @Test
    fun itsWork() {
        val result = testJoeRevolverTest.getMaxPrice(5, 13)
        assertEquals(10, result)
    }
}