import kotlin.math.min

class AthleticsStats(val results: String) {
    fun resultsInSecs(): List<Int> {

        val splitResults: List<String> = results.split(", ")

        val timeParts: List<List<String>> = splitResults.map { hhmmss ->
             hhmmss.split("|")
        }

        val totalSecondsCalculated: List<Int> = timeParts.map { time ->
            val hours = time[0].toInt()*3600
            val mins = time[1].toInt()*60
            val secs = time[2].toInt()
            hours+ mins + secs
        }

    return totalSecondsCalculated

    }

    init {

    }

    fun range(): String {
 val sortedResultsInSecs = resultsInSecs().sorted()
        val timeRangeTotalInSecs  = sortedResultsInSecs.last() - sortedResultsInSecs.first()

        val timeRangeHours = (timeRangeTotalInSecs / 3600)
        val timeRangeMins = (timeRangeTotalInSecs % 3600) / 60
        val timeRangeSecs = (timeRangeTotalInSecs % 3600) % 60


        return "${timeRangeHours.toString().padStart(2,'0')}|${timeRangeMins.toString().padStart(2,'0')}|${timeRangeSecs.toString().padStart(2,'0')}"
    }
}