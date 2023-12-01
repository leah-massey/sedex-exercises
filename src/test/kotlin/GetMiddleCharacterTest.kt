import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class GetMiddleCharacterTest {
    @Test
    fun `an input 'a' returns 'a'`() {
        val getMiddleCharacter = GetMiddleCharacter()
        val expected = "a"
        val actual = getMiddleCharacter.getMiddle("a")

        assertEquals(expected, actual)
    }

    @Test
    fun `an input 'aba' returns 'b'`() {
        val getMiddleCharacter = GetMiddleCharacter()
        val expected = "b"
        val actual = getMiddleCharacter.getMiddle("aba")

        assertEquals(expected, actual)
    }

    @Test
    fun `an input 'abaa' returns 'ba'`() {
        val getMiddleCharacter = GetMiddleCharacter()
        val expected = "ba"
        val actual = getMiddleCharacter.getMiddle("abaa")

        assertEquals(expected, actual)
    }


}