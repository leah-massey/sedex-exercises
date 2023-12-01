class GetMiddleCharacter {
    fun getMiddle(str: String): String {

        val midIndex = (str.length -1) /2 // this gives me middle index for odd number and first of two middle indices for even

        if (str.length % 2 == 0) {
            val secondMidIndex = midIndex + 1
            return str.slice(midIndex..secondMidIndex)
        } else {
            return str[midIndex].toString()
        }
    }
}