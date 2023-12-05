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
        val expected = listOf("", "0")
        val actual = characterRepeat.longestRepeat("")
    }


}

