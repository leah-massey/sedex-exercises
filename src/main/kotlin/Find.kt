class Find {
    fun find(list: List<Int>): Int {
        val splitOddAndEven = list.partition { number -> number % 2 == 0 }
        return if (splitOddAndEven.first.size == 1)  splitOddAndEven.first[0] else  splitOddAndEven.second[0]
    }
}


