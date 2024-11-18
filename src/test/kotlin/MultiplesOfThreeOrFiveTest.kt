
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test


class MultiplesOfThreeOrFiveTest {
    @Test
    fun `a 3 returns 3`() {
        //given
        val number = 3
        val underTest = MultiplesOfThreeOrFive()

        //when
        val solution =  underTest.solution(number)

        //then
        assertEquals(0, solution)
    }


    @Test
    fun `a 10 returns 23`() {
        //given
        val number = 10
        val underTest = MultiplesOfThreeOrFive()

        //when
        val solution =  underTest.solution(number)

        //then
        assertEquals(23, solution)
    }

    @Test
    fun `a 20 returns 78`() {
        //given
        val number = 20
        val underTest = MultiplesOfThreeOrFive()

        //when
        val solution =  underTest.solution(number)

        //then
        assertEquals(78, solution)
    }

    @Test
    fun `a negative number returns 0`() {
        //given
        val number = -6
        val underTest = MultiplesOfThreeOrFive()

        //when
        val solution =  underTest.solution(number)

        //then
        assertEquals(0, solution)
    }
}