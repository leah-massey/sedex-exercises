import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class VehicleInterfacesExerciseTest {
    @Test
    fun `a vehicleRepo that contains 3 vehicle IDs returns 3`() {
        val mockVehicleRepoThatHasThreeVehicles = object: VehicleInterfacesExercise.VehicleRepoInterface {
            override fun getListOfVehicles(): List<String> {
                return listOf("audi", "bmw", "porsche")
            }
        }
        val vehicleInterfacesExercise = VehicleInterfacesExercise(mockVehicleRepoThatHasThreeVehicles)
        val expected = 3
        val actual = vehicleInterfacesExercise.getCountOfVehicles()

        assertEquals(expected, actual)

    }

    @Test
    fun `a vehicleRepo that contains 5 vehicle IDs returns 5`() {
        val mockVehicleRepoThatHasFiveVehicles = object: VehicleInterfacesExercise.VehicleRepoInterface {
            override fun getListOfVehicles(): List<String> {
                return listOf("audi", "bmw", "porsche", "Toyota", "Nissan")
            }
        }
            val underTest = VehicleInterfacesExercise(mockVehicleRepoThatHasFiveVehicles)
            val expected = 5
            val actual = underTest.getCountOfVehicles()
            assertEquals(expected, actual)
        }

}