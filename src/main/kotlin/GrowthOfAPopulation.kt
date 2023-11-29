class GrowthOfAPopulation {
    fun nbYear(p0: Int, percent: Float, aug: Int, p: Int): Int {

        var currentPopulation: Int = p0
        var years: Int = 0

        if (currentPopulation == p) {
            return 0
        } else {
            while ( currentPopulation < p) {
                years += 1
                currentPopulation = currentPopulation + (currentPopulation * (percent / 100)).toInt()
            }
            return years
        }

    }
}