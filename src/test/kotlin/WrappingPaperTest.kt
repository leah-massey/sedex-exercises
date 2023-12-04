import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class WrappingPaperTest{
    @Test
    fun `a square box 1ft x 1ft x 1ft returns 7`() {
        // 2*1 + 2*1+ 2*1 + 1
        //7 sq feet

        val underTest = WrappingPaper()
        val expected = 7
        val actual = underTest.paperNeeded(1, 1, 1)

        assertEquals(expected, actual)
    }

}