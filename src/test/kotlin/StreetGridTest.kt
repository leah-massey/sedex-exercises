import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class StreetGridTest {
    @Test
    fun `a single movement in any direction leaves you 1 block away`() {
        val underTest = StreetGrid()
        val expected = 1
        val actual = underTest.blockDistance(listOf("R1"))
    }
}