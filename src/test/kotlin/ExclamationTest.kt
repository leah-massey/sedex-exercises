import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class ExclamationTest {
    @Test
    fun `it turns a vowel to an exclamation in a single letter sentence`() {
        val underTest = Exclamation()
        val expected  = "!"
        val result = underTest.vowelToEx("a")

        assertEquals(expected, result)
    }

    @Test
    fun `it turns a vowel to an exclamation in a word`() {
        val underTest = Exclamation()
        val expected  = "H!!"
        val result = underTest.vowelToEx("Hi!")

        assertEquals(expected, result)
    }
}