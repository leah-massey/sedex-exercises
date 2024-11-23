import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test


//You are given an array (which will have a length of at least 3, but could be very large) containing integers.
// The array is either entirely comprised of odd integers or entirely
// comprised of even integers except for a single integer N.
// Write a method that takes the array as an argument and returns this "outlier" N.


class FindTest() {
    @Test
    fun `an array of 2 odd integers and one even returns the even integer`() {
        //given
        val integers = listOf(1,2,3)
        val undertest = Find()
        //when
        val actual = undertest.find(integers)
        //then
        assertEquals(2, actual)
    }

    @Test
    fun `a list containing only 1 odd value returns the odd value`() {
        //given
        val integers = listOf(1,2,4,6,8,10)
        val undertest = Find()
        //when
        val actual = undertest.find(integers)
        //then
        assertEquals(1, actual)
    }
}
