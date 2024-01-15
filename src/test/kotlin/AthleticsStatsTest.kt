import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

class AthleticsStatsTest {

    @Nested
    inner class resultsInSecsTest {
        @Test
        fun `results are converted from hh|mm|ss to ss`() {
            val underTest = AthleticsStats("02|20|10")
            val expected = listOf(8410) // 7200 + 1200 + 10
            val actual = underTest.resultsInSecs()

            assertEquals(expected, actual)
        }@Test
        fun `results are converted from hh|mm|ss to ss and retuned as list`() {
            val underTest = AthleticsStats("02|20|10, 01|01|01")
            val expected = listOf(8410, 3661) // 7200 + 1200 + 10
            val actual = underTest.resultsInSecs()

            assertEquals(expected, actual)
        }
    }

    @Nested
    inner class rangeFunctionTest {
        @Test
         fun `a single entry returns a range 0`() {
            val underTest = AthleticsStats("00|20|10")
            val expected = "00|00|00"
            val actual = underTest.range()

            assertEquals(expected, actual)
         }

        @Test
        fun `when multiple results are in the list, the range is the difference between the fastest and slowest`() {
            val underTest = AthleticsStats("00|20|10, 00|21|10")
            val expected = "00|01|00"
            val actual = underTest.range()

            assertEquals(expected, actual)

        }

    }
}