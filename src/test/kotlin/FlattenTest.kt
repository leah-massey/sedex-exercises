import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class FlattenTest {
    @Test
    fun `it iterates through a list and returns, flattened`() {
        val underTest = Flatten()
        val expected = listOf(1, 1, 2, 3, 5, 8)
        val actual = underTest.flatList(listOf(listOf(1, 1), 2, listOf(3, listOf(5, 8))))
    }

}