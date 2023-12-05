class LostSanta(floorMap: String) {

    val instructions: List<Char> = floorMap.toList()
    var floor: Int = 0
    var position: Int = 0

    fun findFloor(): Int {
        instructions.forEach {
            when(it) {
                '(' -> floor++
                ')' -> floor--
            }
        }
        return floor
    }

    fun hitsBasement():String {
        instructions.forEach {
            when(it) {
                '(' -> floor++
                ')' -> floor--
            }
            position ++
            if (floor == - 1) {
                return position.toString()

            }
        }
        return "you never go in the basement"
    }
}