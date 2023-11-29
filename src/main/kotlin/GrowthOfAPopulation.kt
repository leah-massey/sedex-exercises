class GrowthOfAPopulation {
    fun nbYear(p0: Int, percent: Float, aug: Int, p: Int): Int {

        var currentPopulation: Float = p0.toFloat()
        var years: Int = 0

        if (p0 == p) {
            return 0
        } else {
            while ( currentPopulation.toInt() < p) {
                years += 1
                currentPopulation = nextYearsPopulation(currentPopulation, percent)
                currentPopulation += aug
            }
            return years
        }

    }

    fun nextYearsPopulation(currentPopulation: Float, percent: Float): Float {
       return currentPopulation + (currentPopulation * (percent / 100))
    }
}