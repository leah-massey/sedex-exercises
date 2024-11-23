import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

//Write a function that will return the count of distinct case-insensitive alphabetic characters
// and numeric digits that occur more than once in the input string.
// The input string can be assumed to contain only alphabets (both uppercase and lowercase) and numeric digits.
class CountingDuplicatesTest() {
    @Test
    fun `a string of unique letters returns the length of the string`() {
        //given
        val text = "swathe"
        val underTest = CountingDuplicates()

        //when
        val actual = underTest.duplicateCount(text)

        //then
        assertEquals(6, actual)
    }

    @Test
    fun `a string of with duplicated letters only counts the repeated letter once`() {
        //given
        val text = "hello"
        val underTest = CountingDuplicates()

        //when
        val actual = underTest.duplicateCount(text)

        //then
        assertEquals(4, actual)
    }
}