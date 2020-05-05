import org.junit.Assert.assertNull
import org.junit.Assert.assertTrue
import org.junit.Assert.assertEquals
import org.junit.Test
import subtask5.TelephoneFinder

class NeighborsTelephonesTests {

    private val finder = TelephoneFinder()

    @Test
    fun testFinder1() {
        val result = finder.findAllNumbersFromGivenNumber("5")
        assertEquals(4, result?.size)
        result?.let {
            assertTrue(result.contains("2"))
            assertTrue(result.contains("4"))
            assertTrue(result.contains("6"))
            assertTrue(result.contains("8"))
        }
    }

    @Test
    fun testFinder2() {
        val result = finder.findAllNumbersFromGivenNumber("8675309")
        assertEquals(18, result?.size)
        result?.let {
            assertTrue(result.contains("5675309"))
            assertTrue(result.contains("7675309"))
            assertTrue(result.contains("9675309"))
            assertTrue(result.contains("0675309"))
            assertTrue(result.contains("8375309"))
            assertTrue(result.contains("8575309"))
            assertTrue(result.contains("8975309"))
            assertTrue(result.contains("8645309"))
            assertTrue(result.contains("8685309"))
            assertTrue(result.contains("8672309"))
            assertTrue(result.contains("8674309"))
            assertTrue(result.contains("8676309"))
            assertTrue(result.contains("8678309"))
            assertTrue(result.contains("8675209"))
            assertTrue(result.contains("8675609"))
            assertTrue(result.contains("8675389"))
            assertTrue(result.contains("8675306"))
            assertTrue(result.contains("8675308"))
        }
    }

    @Test
    fun testFinder3() {
        val result = finder.findAllNumbersFromGivenNumber("-634756385")
        assertNull(result)
    }
}
