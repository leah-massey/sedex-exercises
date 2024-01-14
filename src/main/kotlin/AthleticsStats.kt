class AthleticsStats(results: String) {
    val results = results //"00|00|20"
    fun resultsInSecs(): List<Int> {
        val hoursMinsSecs: List<String> = results.split("|")
        println(hoursMinsSecs)
        val hoursAsSecs: Int = hoursMinsSecs[0].toInt()*3600
        val minsAsSecs: Int = hoursMinsSecs[1].toInt()*60
        val secs: Int = hoursMinsSecs[2].toInt()

        return listOf(hoursAsSecs + minsAsSecs + secs)
    }

    fun range(): String {
        return "00|00|00"
    }
}