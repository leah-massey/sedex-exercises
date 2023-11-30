//In this kata you will be given a random string of letters and tasked with returning them as a string of comma-separated
// sequences sorted alphabetically, with each sequence starting with an uppercase character followed by n-1 lowercase characters, where n is the letter's alphabet position 1-26.
//
//Example
//alphaSeq("ZpglnRxqenU") -> "Eeeee,Ggggggg,Llllllllllll,Nnnnnnnnnnnnnn,Nnnnnnnnnnnnnn,Pppppppppppppppp,Qqqqqqqqqqqqqqqqq,Rrrrrrrrrrrrrrrrrr,Uuuuuuuuuuuuuuuuuuuuu,Xxxxxxxxxxxxxxxxxxxxxxxx,Zzzzzzzzzzzzzzzzzzzzzzzzzz"
//Technical Details
//The string will include only letters.
//The first letter of each sequence is uppercase followed by n-1 lowercase.
//Each sequence is separated with a comma.
//Return value needs to be a string.

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class AlphabeticalSequenceTest {

    @Test
    fun `string 'b' returns 'Bb'`() {
        val alphabeticalSequence = AlphabeticalSequence()
        val expected = "Bb"
        val actual = alphabeticalSequence.alphaSeq("b")

        assertEquals(expected, actual)
    }

    @Test
    fun `string 'c' returns 'Ccc'`() {
        val alphabeticalSequence = AlphabeticalSequence()
        val expected = "Ccc"
        val actual = alphabeticalSequence.alphaSeq("c")

        assertEquals(expected, actual)
    }

    @Test
    fun `string 'bcd' returns 'BbCccDddd'`() {
        val alphabeticalSequence = AlphabeticalSequence()
        val expected = "Bb,Ccc,Dddd"
        val actual = alphabeticalSequence.alphaSeq("bcd")

        assertEquals(expected, actual)
    }

    @Test
    fun `string 'bCd' returns 'BbCccDddd'`() {
        val alphabeticalSequence = AlphabeticalSequence()
        val expected = "Bb,Ccc,Dddd"
        val actual = alphabeticalSequence.alphaSeq("bCd")

        assertEquals(expected, actual)
    }

    @Test
    fun `string 'ZpglnRxqenU' returns 'Eeeee,Ggggggg,Llllllllllll,Nnnnnnnnnnnnnn,Nnnnnnnnnnnnnn,Pppppppppppppppp,Qqqqqqqqqqqqqqqqq,Rrrrrrrrrrrrrrrrrr,Uuuuuuuuuuuuuuuuuuuuu,Xxxxxxxxxxxxxxxxxxxxxxxx,Zzzzzzzzzzzzzzzzzzzzzzzzzz'`() {
        val alphabeticalSequence = AlphabeticalSequence()
        val expected = "Eeeee,Ggggggg,Llllllllllll,Nnnnnnnnnnnnnn,Nnnnnnnnnnnnnn,Pppppppppppppppp,Qqqqqqqqqqqqqqqqq,Rrrrrrrrrrrrrrrrrr,Uuuuuuuuuuuuuuuuuuuuu,Xxxxxxxxxxxxxxxxxxxxxxxx,Zzzzzzzzzzzzzzzzzzzzzzzzzz"
        val actual = alphabeticalSequence.alphaSeq("ZpglnRxqenU")

        assertEquals(expected, actual)
    }


    // when you get an uppercase letter


}