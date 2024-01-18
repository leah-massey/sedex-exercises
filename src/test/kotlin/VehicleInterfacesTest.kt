import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class VehicleInterfacesTest {
    @Test
    fun `a vehicleRepo that contains 3 vehicle IDs returns 3`() {

        val mockVehicleRepoThatHasThreeVehicles = object: VehicleInterfaces.VehicleRepoInterface {
            override fun getListOfVehicles(): List<String> {
                return listOf("audi", "bmw", "porsche")
            }
        }

        val vehicleInterfaces = VehicleInterfaces(mockVehicleRepoThatHasThreeVehicles)
        val expected = 3
        val actual = vehicleInterfaces.getCountOfVehicles()

        assertEquals(expected, actual)

    }
}