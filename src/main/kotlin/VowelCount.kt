
/* Return the number (count) of vowels in the given string.
We will consider a, e, i, o, u as vowels for this Kata (but not y).
The input string will only consist of lower case letters and/or spaces.*/

class VowelCount {

    fun count(string: String): Int {

        var vowels: List<String> = listOf("a", "e", "i", "o", "u")

        var vowelsInString: Int = 0
        val letters: List<String> = string.split("")

        for (i in letters) {
            if (vowels.contains(i)) {
                vowelsInString += 1
            }
        }
        return vowelsInString
    }

}