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
}