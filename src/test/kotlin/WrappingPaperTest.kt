import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class WrappingPaperTest{
    @Test
    fun `a square box 1ft x 1ft x 1ft returns 7`() {
        // 2*1 + 2*1+ 2*1 + 1  = 7 sq feet

        val underTest = WrappingPaper()
        val expected = 7
        val actual = underTest.paperNeeded(1, 1, 1)

        assertEquals(expected, actual)
    }

    @Test
    fun `a box 1ft x 2ft x 3ft returns 27`() {
        // 2*1*2 + 2*2*3+ 2*3*1 + 2  =  ? sq feet
        // 4 + 12 + 6 + 2 = 24

        val underTest = WrappingPaper()
        val expected = 24
        val actual = underTest.paperNeeded(1, 2, 3)

        assertEquals(expected, actual)
    }

    @Test
    fun `a box 2ft x 3ft x 4ft returns 58`() {
        // 2*1*2 + 2*2*3+ 2*3*1 + 2  =  ? sq feet
        // 4 + 12 + 6 + 2 = 24

        val underTest = WrappingPaper()
        val expected = 58
        val actual = underTest.paperNeeded(2, 3, 4)

        assertEquals(expected, actual)
    }

}