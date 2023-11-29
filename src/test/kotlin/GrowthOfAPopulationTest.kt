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

    @Test
    fun `A population of 100 takes 2 years to reach 300 when percent = 100f and aug = 0`() {
        // year 1 = 100
        // year 2 = 200
        // year 3 = 400
        val underTest = GrowthOfAPopulation()
        val result: Int = underTest.nbYear(100, 100.0f, 0, 300)
        val expected: Int = 2

        assertEquals(expected, result)
    }

    @Test

    fun `A population of 100 takes 4 years to reach 226 when percent = 50f and aug = 0`() {
        // year 0 = 100
        // year 1 = 150
        // year 2 = 225
        // year 3 = 337.5

        val underTest = GrowthOfAPopulation()
        val expected: Int = 3
        val result: Int = underTest.nbYear(100, 50f, 0, 226)

        assertEquals(expected, result)
    }
}



