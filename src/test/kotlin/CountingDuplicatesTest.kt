import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

//Write a function that will return the count of distinct case-insensitive alphabetic characters
// and numeric digits that occur more than once in the input string.
// The input string can be assumed to contain only alphabets (both uppercase and lowercase) and numeric digits.
class CountingDuplicatesTest() {
    @Test
    fun `a string of unique letters returns 0`() {
        //given
        val text = "swathe"
        val underTest = CountingDuplicates()

        //when
        val actual = underTest.duplicateCount(text)

        //then
        assertEquals(0, actual)
    }

    @Test
    fun `a string of with 1 duplicated letter returns 1`() {
        //given
        val text = "hello"
        val underTest = CountingDuplicates()

        //when
        val actual = underTest.duplicateCount(text)

        //then
        assertEquals(1, actual)
    }

    @Test
    fun `is not case sensitive`() {
        //given
        val text = "helLo"
        val underTest = CountingDuplicates()

        //when
        val actual = underTest.duplicateCount(text)

        //then
        assertEquals(1, actual)
    }



    @Test
    fun `handles large arrays`() {
        //given
        val text = "8nkvcV6X2XK28nHco0X90HH82hnOv8chH9kXoz20ONOkoZhK0nZ0nKxoooH2x80NnNO"
        val underTest = CountingDuplicates()

        //when
        val actual = underTest.duplicateCount(text)

        //then
        assertEquals(12, actual)
    }
}