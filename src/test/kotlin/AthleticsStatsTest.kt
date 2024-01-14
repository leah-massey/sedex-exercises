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
        }
    }

    @Nested
    inner class rangeFunctionTest {
        @Test
         fun `a single entry returns a range 0`() {
            val underTest = AthleticsStats("00|20|10")
            val expected = 0
            val actual = underTest.range()

         }

    }
}