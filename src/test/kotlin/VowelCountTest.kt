/* Return the number (count) of vowels in the given string.
We will consider a, e, i, o, u as vowels for this Kata (but not y).
The input string will only consist of lower case letters and/or spaces.*/

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class VowelCountTest {
    @Test
    fun `a string with no vowels returns 0`() {
        val underTest = VowelCount()
        val result: Int = underTest.count("wrd")
        val expected: Int = 0

        assertEquals(expected, result)
    }

    @Test
    fun `a string with one vowel returns 1`() {
        val underTest = VowelCount()
        val result: Int = underTest.count("word")
        val expected: Int = 1

        assertEquals(expected, result)
    }

    @Test
    fun `returns the number of vowels in the string`() {
        val underTest = VowelCount()
        val result: Int = underTest.count("christmas wreath ")
        val expected: Int = 4

        assertEquals(expected, result)
    }

}