import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import kotlin.test.assertFailsWith

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

    @Test
    fun `A population of 1 takes 2 years to reach 2 when percent = 77f and aug = 0`() {
        // year 0 = 1
        // year 1 = 1.77
        // year 2 = 3.13

        val underTest = GrowthOfAPopulation()
        val expected: Int = 2
        val result: Int = underTest.nbYear(1, 77f, 0, 2)

        assertEquals(expected, result)
    }

    @Test
    fun `A population of 1 takes 2 years to reach 5 when percent = 77f and aug = 3`() {
        // year 0 = 1
        // year 1 = 4.77
        // year 2 = 11.4429

        val underTest = GrowthOfAPopulation()
        val expected: Int = 2
        val result: Int = underTest.nbYear(1, 77f, 3, 5)

        assertEquals(expected, result)
    }

    @Test
    fun `A population of 1 takes 3 years to reach 4 when percent 0-point-8f and aug = 1`() {
        // year 0 = 1
        // year 1 = 2.008
        // year 2 = 3.024...
        // year 3 = 4.048

        val underTest = GrowthOfAPopulation()
        val expected: Int = 3
        val result: Int = underTest.nbYear(1, 0.8f, 1, 4)

        assertEquals(expected, result)
    }

    @Test
    fun `A population of 0 with 0 throws an IllegalArgumentException`() {
        assertFailsWith<IllegalArgumentException> {
            val underTest = GrowthOfAPopulation()
            underTest.nbYear(0, 2f, 0, 1)  }
    }

    // alternative way of writing the above test - not sure which is better practise
//    @Test
//    fun `A pop of 0 with 0 throws an IllegalArgumentException`() {
//
//        assertFailsWith<IllegalArgumentException>(
//            message = "Your population will never increase.",
//            block = {
//                    val underTest = GrowthOfAPopulation()
//                    underTest.nbYear(0, 2f, 0, 1)
//            }
//
//        )
//    }


}



