import kotlin.math.abs

class StreetGrid {

    var yValue = 0
    var xValue = 0
    val compassPoints: List<String> = listOf("North", "East", "South", "West")
    var currentDirection: String = compassPoints[0] //"North"
    fun blockDistance(directions: List<String>): Int {

        directions.forEach {
            val distance: Int = it.toList()[1].digitToInt() // get number eg 2
            val direction = it.toList()[0] // get L or R

            if (direction == 'R') {
                //change existing direction
                if (currentDirection == "West") {
                    currentDirection = "North"
                } else {
                    turnClockwise()
                }
                travel(distance)
            }

            if (direction == 'L') {
                // change the existing direction
                if (currentDirection == "North") {
                    currentDirection = "West"
                } else {
                    turnAntiClockwise()
                }
                travel(distance)
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