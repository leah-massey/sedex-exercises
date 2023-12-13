import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class FlattenTest {
    @Test
    fun `a list of 2 returns listOf(2)`() {
        val underTest = Flatten()
        val expected = listOf(2)
        val actual = underTest.getFlatList(listOf( 2))
        assertEquals(expected, actual)
    }



    @Test
    fun `a listOf(listOf(2)) returns listOf(2)`() {
        val underTest = Flatten()
        val expected = listOf(2)
        val actual = underTest.getFlatList(listOf(listOf(2)))
        assertEquals(expected, actual)
    }

    @Test
    fun `a listOf(listOf(2, listOf(2)) returns listOf(2, 2)`() {
        val underTest = Flatten()
        val expected = listOf(2, 2)
        val actual = underTest.getFlatList(listOf(2, listOf(2)))
        assertEquals(expected, actual)
    }



}

//listOf(1, 1), 2, listOf(3, listOf(5, 8)))