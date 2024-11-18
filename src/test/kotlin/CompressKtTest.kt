import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class CompressKtTest {
    @Test
    fun `it returns a list with no repeated elements`() {
        val expected = listOf("a", "b", "c")
        val actual = compress(("aabc".toList()))
    }
}