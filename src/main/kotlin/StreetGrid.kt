import kotlin.math.abs

class StreetGrid {
    var yValue = 0
    var xValue = 0
    val compassPoints: List<String> = listOf("North", "East", "South", "West")
    var currentDirection: String = compassPoints[0] //"North"
    fun blockDistance(directions: List<String>): Int {
        directions.forEach {
            val distanceToTravel: Int = it.toList()[1].digitToInt()
            val directionToTurn = it.toList()[0]
            if (directionToTurn == 'R') {
                when (currentDirection) {
                    "West" -> "North"
                    else -> turnClockwise()
                }
                travel(distanceToTravel)
            }
            if (directionToTurn == 'L') {
                when (currentDirection) {
                    "North" -> "West"
                    else -> turnAntiClockwise()
                }
                travel(distanceToTravel)
            }
        }
        return (abs(xValue) + abs(yValue))
    }

    fun travel(distance: Int) {
        when (currentDirection) {
            "North" -> yValue += distance
            "South" -> yValue -= distance
            "East" -> xValue += distance
            "West" -> xValue -= distance
        }
    }

    fun turnClockwise() {
        currentDirection = compassPoints[compassPoints.indexOf(currentDirection) + 1]
    }

    fun turnAntiClockwise() {
        currentDirection = compassPoints[compassPoints.indexOf(currentDirection) - 1]
    }
}