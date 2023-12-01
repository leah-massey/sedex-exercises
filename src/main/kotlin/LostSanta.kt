class LostSanta {
    fun findFloor(floorMap: String): Int {
        var instructions: List<Char> = floorMap.toList()
        var floor: Int = 0

        instructions.forEach {
            if(it == '(') {
            floor++
            } else {
            floor--
            }
        }

        return floor
    }
}