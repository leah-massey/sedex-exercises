class StreetGrid {

    var yValue = 0
    var xValue = 0

    val compassPoints: List<String> = listOf("North", "East", "South", "West")
    var currentDirection: String = compassPoints[0] //"North"
    fun blockDistance(directions: List<String>): Int {

        directions.forEach {
            val distance: Int = it.toCharArray()[1].digitToInt() // get number eg 2
            val direction = it.toList()[0] // get L or R

            if (direction == 'R') {
                //change existing direction
                if (currentDirection == "West") {
                    currentDirection = "North"
                } else {
                    currentDirection = compassPoints[compassPoints.indexOf(currentDirection) + 1]
                }
                // move in the updated direction
                travel(distance)
            }

            if (direction == 'L') {
                // change the existing direction
                if (currentDirection == "North") {
                    currentDirection = "West"
                } else {
                    currentDirection = compassPoints[compassPoints.indexOf(currentDirection) - 1]
                }
                // move in the updated direction
                travel(distance)
            }
        }

        if (xValue < 0) {
            xValue = xValue * -1
        }

        if (yValue < 0) {
            yValue = yValue * -1
        }
        return (xValue + yValue)
    }

    fun travel(distance: Int) {
        if (currentDirection == "North") {
            yValue += distance
        } else if (currentDirection == "South") {
            yValue -= distance
        } else if (currentDirection == "East") {
            xValue += distance
        } else if (currentDirection == "West") {
            xValue -= distance
        }
    }
}