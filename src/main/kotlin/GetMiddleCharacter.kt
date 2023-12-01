class GetMiddleCharacter {
    fun getMiddle(str: String): String {

        val middleIndex = (str.length -1) /2

        return str[middleIndex].toString()
    }
}