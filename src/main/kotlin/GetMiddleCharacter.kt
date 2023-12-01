class GetMiddleCharacter {
    fun getMiddle(str: String): String {

        val firstMidIndex = (str.length -1)/2
        val secondMidIndex = str.length - firstMidIndex

        return str.substring(firstMidIndex, secondMidIndex)
    }
}