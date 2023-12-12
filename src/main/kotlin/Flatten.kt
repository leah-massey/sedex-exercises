class Flatten {
    fun getFlatList(data: List<Any>): List<Int> {
        var flattenedList: MutableList<Int> = mutableListOf()
        data.forEach {     // listOf(listOf(1, 1), 2, listOf(3, listOf(5, 8)))         // listOf(listOf(1, 1),listOf(3, listOf(5, 8))
            if (it is Int) {
                flattenedList.add(it)
            }
        }
        return(flattenedList)
    }
}