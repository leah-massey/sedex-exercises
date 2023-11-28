import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class GrowthOfAPopulationTest {

    @Test
    fun `A population of 1200 takes 0 years to reach 1200`() {
        val underTest = GrowthOfAPopulation()
        val result: Int = underTest.nbYear(1200, 1.0f, 1, 1)
        val expected: Int = 0

        assertEquals(expected, result)
    }
}



