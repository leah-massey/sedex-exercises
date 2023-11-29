class GrowthOfAPopulation {
    fun nbYear(p0: Int, percent: Float, aug: Int, p: Int): Int {

        // if population is 0 and the annual increase is 0 throw an exception to avoid infinite loop
        if ((p0 == 0 && aug == 0) || ( p0 < p && percent == 0f && aug == 0 )) {
            throw IllegalArgumentException("Your population will never increase.")
        }

        var currentPopulation: Float = p0.toFloat() // I want the value to be a float so that I can calculate any new population increase accurately from the exactly last number.
        var years: Int = 0

        return if (p0 == p) {
            0
        } else {
            while ( currentPopulation.toInt() < p) {
                years += 1
                currentPopulation = nextYearsPopulation(currentPopulation, percent, aug)
            }
            years
        }

    }

    private fun nextYearsPopulation(currentPopulation: Float, percent: Float, aug: Int): Float {
       return currentPopulation + (currentPopulation * (percent / 100)) + aug
    }
}