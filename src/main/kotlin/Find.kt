class Find {
    fun find(numberArray: Array<Int>): Int {
        val (even, odd) = numberArray.partition { number -> number % 2 == 0 }
        return if (even.size == 1)  even[0] else  odd[0]
    }
}


