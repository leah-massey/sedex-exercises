class VehicleInterfacesExercise(val vehiclerepo: VehicleRepoInterface) {

    fun getCountOfVehicles(): Int {
        return vehiclerepo.getListOfVehicles().size
    }

    interface VehicleRepoInterface {
        fun getListOfVehicles(): List<String>
    }
}