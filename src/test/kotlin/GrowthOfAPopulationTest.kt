import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class GrowthOfAPopulationTest {

    @Test
    fun `A population of 1200 takes 0 years to reach 1200`() {
        val underTest = GrowthOfAPopulation()
        val result: Int = underTest.nbYear(1200, 1.0f, 1, 1200)
        val expected: Int = 0

        assertEquals(expected, result)
    }

    @Test
    fun `A population of 100 takes 1 year to reach 200 when percent = 100f and aug = 0`() {
        val underTest = GrowthOfAPopulation()
        val result: Int = underTest.nbYear(100, 100.0f, 0, 200)
        val expected: Int = 1

        assertEquals(expected, result)
    }

}



