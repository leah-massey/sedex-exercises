class GrowthOfAPopulation {
    fun nbYear(p0: Int, percent: Float, aug: Int, p: Int): Int {

        if (p0 == 0 && aug == 0) {
            println("you're in there!")
            throw IllegalArgumentException("Your population will never increase.")
        }

        var currentPopulation: Float = p0.toFloat()
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

    fun nextYearsPopulation(currentPopulation: Float, percent: Float, aug: Int): Float {
       return currentPopulation + (currentPopulation * (percent / 100)) + aug
    }
}