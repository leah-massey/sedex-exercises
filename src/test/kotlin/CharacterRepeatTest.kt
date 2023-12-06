/* For a given string s find the character c (or C) with longest consecutive repetition and return:
[c, l]
where l (or L) is the length of the repetition. If there are two or more characters with the same l return the first in order of appearance.
For empty string return:
["", 0] */

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class CharacterRepeatTest {
    @Test
    fun `an empty string returns ("", 0)`() {
        val characterRepeat = CharacterRepeat()
        val expected = Pair("", 0)
        val actual = characterRepeat.longestRepeat("")

        assertEquals(expected, actual)
    }

    @Test
    fun `a string of a single character returns its length`() {
        val characterRepeat = CharacterRepeat()
        val expected = Pair("a", 3)
        val actual = characterRepeat.longestRepeat("aaa")

        assertEquals(expected, actual)
    }

    @Test
    fun `a string of a multiple characters returns the longest character repeat`() {
        val characterRepeat = CharacterRepeat()
        val expected = Pair("a", 3)
        val actual = characterRepeat.longestRepeat("bbaaabb")

        assertEquals(expected, actual)
    }

    @Test
    fun `a letter of different case is not counted as the same`() {
        val characterRepeat = CharacterRepeat()
        val expected = Pair("C", 6)
        val actual = characterRepeat.longestRepeat("bbCCCCCCcccaaabbaaa")

        assertEquals(expected, actual)
    }

}

