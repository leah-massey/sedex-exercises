/* In this little assignment you are given a string of space separated numbers, and have to return the highest and
 lowest number.

Examples
highAndLow("1 2 3 4 5");  // return "5 1"
highAndLow("1 2 -3 4 5"); // return "5 -3"
highAndLow("1 9 3 4 -5"); // return "9 -5"
highAndLow("1"); // return "1 1"

Notes
All numbers are valid Int32, no need to validate them.
There will always be at least one number in the input string.
Output string must be two numbers separated by a single space, and highest number is first.
*/

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class HighestAndLowestTest {
    @Test
    fun `an argument of '2 1' returns '2 1'`() {
        val underTest = HighestAndLowest()
        val result: String = underTest.highAndLow("2 1")
        val expected: String = "2 1"

        assertEquals(expected, result)
    }
    @Test
    fun `an argument of '3 2 1' returns '3 1'`() {
        val underTest = HighestAndLowest()
        val result: String = underTest.highAndLow("3 2 1")
        val expected: String = "3 1"

        assertEquals(expected, result)
    }

    @Test
    fun `an argument of '2 4 1 3' returns '4 1'`() {
        val underTest = HighestAndLowest()
        val result: String = underTest.highAndLow("2 4 1 3")
        val expected: String = "4 1"

        assertEquals(expected, result)
    }

    @Test
    fun `an argument of '1 2 -3 4 5' returns '5 -3'`() {
        val underTest = HighestAndLowest()
        val result: String = underTest.highAndLow("1 2 -3 4 5")
        val expected: String = "5 -3"

        assertEquals(expected, result)
    }

    @Test
    fun `an argument of '2' returns '2 2'`() {
        val underTest = HighestAndLowest()
        val result: String = underTest.highAndLow("2")
        val expected: String = "2 2"

        assertEquals(expected, result)
    }

    @Test
    fun `an argument of '10 20 1 15' returns '20 1'`() {
        val underTest = HighestAndLowest()
        val result: String = underTest.highAndLow("10 20 1 15")
        val expected: String = "20 1"

        assertEquals(expected, result)
    }

    @Test
    fun `an argument of '15' returns '15 15'`() {
        val underTest = HighestAndLowest()
        val result: String = underTest.highAndLow("15")
        val expected: String = "15 15"

        assertEquals(expected, result)
    }

}