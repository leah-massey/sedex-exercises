class StreetGrid {
    fun blockDistance(directions: List<String>): Int {

        var distance: Int = 0

        println(directions)

        directions.forEach {      // listOf("L2") it = "L2" -> ['L' '2']

            val movement: Int = it.toCharArray()[1].digitToInt() // get number

            distance += movement
            val direction = it.toList()[0]

        }
        return distance
    }
}