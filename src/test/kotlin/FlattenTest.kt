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

    @Test
    fun `a listOf(listOf(1, 1), 2, listOf(3, listOf(5, 8)) returns listOf(1, 1, 2, 3, 5, 8)`() {
        val underTest = Flatten()
        val expected = listOf(1, 1, 2, 3, 5, 8)
        val actual = underTest.getFlatList(listOf(listOf(1, 1), 2, listOf(3, listOf(5, 8))))
        assertEquals(expected, actual)
    }

    @Test
    fun `a listOf(listOf(1, 1), listOf(listOf(2, 6), listOf(3, 2), 2, listOf(3, listOf(5, 8)) returns listOf(1, 1, 2, 6, 3, 2, 2, 3, 5, 8))`() {
        val underTest = Flatten()
        val expected = listOf(1, 1, 2, 6, 3, 2, 2, 3, 5, 8)
        val actual = underTest.getFlatList(listOf(listOf(1, 1), listOf(listOf(2, 6), listOf(3, 2)), 2, listOf(3, listOf(5, 8) )  ))
        assertEquals(expected, actual)
    }


}

//listOf(1, 1), 2, listOf(3, listOf(5, 8)))