class Find {
    fun find(list: List<Int>): Int {
        val splitOddAndEven: Pair<List<Int>, List<Int>> = list.partition { number -> number % 2 == 0 }

        if (splitOddAndEven.first.size == 1) {
            return splitOddAndEven.first[0]
        } else {
            return splitOddAndEven.second[0]
        }
    }
}


