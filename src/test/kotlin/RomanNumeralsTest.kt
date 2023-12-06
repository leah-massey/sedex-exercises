/*Create a function taking a positive integer between 1 and 3999 (both included) as its parameter and returning
a string containing the Roman Numeral representation of that integer.

Modern Roman numerals are written by expressing each digit separately starting with the left most digit and skipping
any digit with a value of zero. In Roman numerals 1990 is rendered: 1000=M, 900=CM, 90=XC; resulting in MCMXC. 2008 is written as 2000=MM, 8=VIII; or MMVIII. 1666 uses each Roman symbol in descending order: MDCLXVI.

Example:

encode(1000) // should return "M" */

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class RomanNumeralsTest {
    @Test
    fun `an input 1000 returns "M"`() {
        val underTest = RomanNumerals()
        val expected = "M"
        val actual = underTest.findRomNum(1000)

        assertEquals(expected, actual)
    }

    @Test
    fun `an input 100 returns "C"`() {
        val underTest = RomanNumerals()
        val expected = "C"
        val actual = underTest.findRomNum(100)

        assertEquals(expected, actual)
    }

    @Test
    fun `an input 2000 returns "MM"`() {
        val underTest = RomanNumerals()
        val expected = "MM"
        val actual = underTest.findRomNum(2000)

        assertEquals(expected, actual)
    }

    @Test
    fun `an input 2200 returns "MMCC"`() {
        val underTest = RomanNumerals()
        val expected = "MMCC"
        val actual = underTest.findRomNum(2200)

        assertEquals(expected, actual)
    }

    @Test
    fun `an input 2250 returns "MMCCL"`() {
        val underTest = RomanNumerals()
        val expected = "MMCCL"
        val actual = underTest.findRomNum(2250)

        assertEquals(expected, actual)
    }

    @Test
    fun `an input 2270 returns "MMCCLXX"`() {
        val underTest = RomanNumerals()
        val expected = "MMCCLXX"
        val actual = underTest.findRomNum(2270)

        assertEquals(expected, actual)
    }

    @Test
    fun `an input 2275 returns "MMCCLXXV"`() {
        val underTest = RomanNumerals()
        val expected = "MMCCLXXV"
        val actual = underTest.findRomNum(2275)

        assertEquals(expected, actual)
    }

    @Test
    fun `an input 3479 returns "MMMCCCCLXXVIIII"`() {
        val underTest = RomanNumerals()
        val expected = "MMMCCCCLXXVIIII"
        val actual = underTest.findRomNum(3479)

        assertEquals(expected, actual)
    }
}