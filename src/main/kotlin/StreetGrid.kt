class StreetGrid {
    fun blockDistance(directions: List<String>): Int {

        var distance: Int = 0
//        var direction = "North"

        println(directions)

        var yValue = 0
        var xValue = 0

        var compassPoints: List<String> = listOf("North", "East", "South", "West")
        var currentDirection: String = compassPoints[0] //"North"

        println(currentDirection)

        println(compassPoints.indexOf(currentDirection))


        directions.forEach {
            // listOf("R1" +x "R1" -y) it = "R2" -> ['R' '2']
            // listOf("R1" +x "L1" +y ) it = "R2" -> ['R' '2']

            val movement: Int = it.toCharArray()[1].digitToInt() // get number eg 2
            val direction = it.toList()[0] // get L or R

            if (direction == 'R') {
                if (currentDirection == "West") {
                    currentDirection = "North"
                } else {
                    currentDirection = compassPoints[compassPoints.indexOf(currentDirection) + 1]
                }
                println("new currentDirection after moving clockwise")
                println(currentDirection)

                if (currentDirection == "North") {
                    yValue += movement
                } else if (currentDirection == "South") {
                    yValue -= movement
                } else if (currentDirection == "East") {
                    xValue += movement
                } else if (currentDirection == "West") {
                    xValue -= movement
                }
            }

            if (direction == 'L') {
                if (currentDirection == "North") {
                    currentDirection = "West"
                } else {
                    currentDirection = compassPoints[compassPoints.indexOf(currentDirection) - 1]
                }
                println("new currentDirection after moving anticlockwise ")
                println(currentDirection)

                if (currentDirection == "North") {
                    yValue += movement
                } else if (currentDirection == "South") {
                    yValue -= movement
                } else if (currentDirection == "East") {
                    xValue += movement
                } else if (currentDirection == "West") {
                    xValue -= movement
                }
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
}