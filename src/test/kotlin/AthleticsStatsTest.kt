import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

class AthleticsStatsTest {

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