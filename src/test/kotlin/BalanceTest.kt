import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import sun.font.TrueTypeFont

class BalanceTest {

    @Test
    fun `an open followed by a closed bracket of the same type returns true`() {
        val input: String = "()"
        val underTest = Balance()
        val expected: Boolean = true
        val actual = underTest.isBalanced(input)

        assertEquals(expected, actual)
    }

    @Test
    fun `a single bracket returns false`() {
        val input: String = "("
        val underTest = Balance()
        val expected: Boolean = false
        val actual = underTest.isBalanced(input)

        assertEquals(expected, actual)
    }

    @Test
    fun `an open followed by an open bracket returns false`() {
        val input: String = "(("
        val underTest = Balance()
        val expected: Boolean = false
        val actual = underTest.isBalanced(input)

        assertEquals(expected, actual)
    }

    @Test
    fun `an open followed by a closed square bracket returns true`() {
        val input: String = "[]"
        val underTest = Balance()
        val expected: Boolean = true
        val actual = underTest.isBalanced(input)

        assertEquals(expected, actual)
    }

    @Test
    fun `an inbalanced series of brackets returns false`() {
        val input: String = "[]()({(}"
        val underTest = Balance()
        val expected: Boolean = false
        val actual = underTest.isBalanced(input)

        assertEquals(expected, actual)
    }

}