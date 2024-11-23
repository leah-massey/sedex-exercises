class Find {
    fun find(numberArray: Array<Int>): Int {
        val splitOddAndEven = numberArray.partition { number -> number % 2 == 0 }
        return if (splitOddAndEven.first.size == 1)  splitOddAndEven.first[0] else  splitOddAndEven.second[0]
    }
}


