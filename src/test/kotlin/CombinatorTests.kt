import org.junit.Assert.assertEquals
import org.junit.Test
import subtask2.Combinator

class CombinatorTests {

    private val combinator = Combinator()

    @Test
    fun testCheckChoose1() {
        val result = combinator.checkChooseFromArray(arrayOf(6, 4))
        assertEquals(2, result)
    }

    @Test
    fun testCheckChoose2() {
        val result = combinator.checkChooseFromArray(arrayOf(4, 4))
        assertEquals(1, result)
    }

    @Test
    fun testCheckChoose3() {
        val result = combinator.checkChooseFromArray(arrayOf(4, 2))
        assertEquals(null, result)
    }

    @Test
    fun testCheckChoose4() {
        val result = combinator.checkChooseFromArray(arrayOf(35, 7))
        assertEquals(3, result)
    }

    @Test
    fun testCheckChoose5() {
        val result = combinator.checkChooseFromArray(arrayOf(36, 7))
        assertEquals(null, result)
    }

    @Test
    fun testCheckChoose6() {
        val result = combinator.checkChooseFromArray(arrayOf(184756, 20))
        assertEquals(10, result)
    }
}