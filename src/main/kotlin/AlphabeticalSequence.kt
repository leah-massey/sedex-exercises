class AlphabeticalSequence {
    fun alphaSeq(string: String): String {
        val str: String = string

        val chars: CharArray = str.toCharArray().sortedArray()

        return chars.joinToString("")
    }
}