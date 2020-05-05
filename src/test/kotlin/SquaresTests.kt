import org.junit.Assert.assertArrayEquals
import org.junit.Assert.assertNull
import org.junit.Test
import subtask4.SquareDecomposer

class SquaresTests {

    private val decomposer = SquareDecomposer()

    @Test
    fun testDecompose1() {
        val result = decomposer.decomposeNumber(50)
        val expectedArray = arrayOf(1, 3, 5, 8, 49)
        assertArrayEquals(expectedArray, result)
    }

    @Test
    fun testDecompose2() {
        val result = decomposer.decomposeNumber(44)
        val expectedArray = arrayOf(2, 3, 5, 7, 43)
        assertArrayEquals(expectedArray, result)
    }

    @Test
    fun testDecompose3() {
        val result = decomposer.decomposeNumber(625)
        val expectedArray = arrayOf(2, 5, 8, 34, 624)
        assertArrayEquals(expectedArray, result)
    }

    @Test
    fun testDecompose4() {
        val result = decomposer.decomposeNumber(5)
        val expectedArray = arrayOf(3, 4)
        assertArrayEquals(expectedArray, result)
    }

    @Test
    fun testDecompose5() {
        val result = decomposer.decomposeNumber(7100)
        val expectedArray = arrayOf(2, 3, 5, 119, 7099)
        assertArrayEquals(expectedArray, result)
    }

    @Test
    fun testDecompose6() {
        val result = decomposer.decomposeNumber(1234567)
        val expectedArray = arrayOf(2, 8, 32, 1571, 1234566)
        assertArrayEquals(expectedArray, result)
    }

    @Test
    fun testDecompose7() {
        val result = decomposer.decomposeNumber(7654321)
        val expectedResult = arrayOf(6, 10, 69, 3912, 7654320)
        assertArrayEquals(expectedResult, result)
    }

    @Test
    fun testDecompose8() {
        val result = decomposer.decomposeNumber(2)
        assertNull(result)
    }

    @Test
    fun testDecompose9() {
        val result = decomposer.decomposeNumber(-50)
        assertNull(result)
    }
}
