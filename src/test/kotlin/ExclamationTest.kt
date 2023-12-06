import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class ExclamationTest {
    @Test
    fun `it turns a vowel to an exclamation`() {
        val underTest = Exclamation()
        val expected  = "!"
        val result = underTest.vowelToEx("a")
    }
}