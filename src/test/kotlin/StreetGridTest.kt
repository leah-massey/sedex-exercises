import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class StreetGridTest {
    @Test
    fun `a movement of 1 in any direction leaves you 1 block away`() {
        val underTest = StreetGrid()
        val expected = 1
        val actual = underTest.blockDistance(listOf("R1"))

        assertEquals(expected, actual)
    }

    @Test
    fun `a movement in two in a single direction takes you 2 blocks away`() {
        val underTest = StreetGrid()
        val expected = 2
        val actual = underTest.blockDistance(listOf("L2"))

        assertEquals(expected, actual)
    }

    @Test
    fun `Following R2, L3 leaves you 5 blocks away`() {
        val underTest = StreetGrid()
        val expected = 5
        val actual = underTest.blockDistance(listOf("R2", "L3"))

        assertEquals(expected, actual)
    }

    @Test
    fun `R2 R2 R2 leaves you 2 blocks due South of your starting position which is 2 blocks away`() {
        val underTest = StreetGrid()
        val expected = 2
        val actual = underTest.blockDistance(listOf("R2", "R2", "R2"))

        assertEquals(expected, actual)
    }



}