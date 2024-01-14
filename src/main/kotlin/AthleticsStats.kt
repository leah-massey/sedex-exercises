class AthleticsStats(results: String) {
    val results = results //"00|00|20"
    fun resultsInSecs(): List<Int> {
        val hoursMinsSecs: List<String> = results.split("|")
        val hours: Int = hoursMinsSecs[0].toInt()
        val mins: Int = hoursMinsSecs[1].toInt()
        val secs: Int = hoursMinsSecs[2].toInt()

        return listOf(hours + mins + secs)
    }

    fun range(): String {
        return "00|00|00"
    }
}