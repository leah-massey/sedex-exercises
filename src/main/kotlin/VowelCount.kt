
/* Return the number (count) of vowels in the given string.
We will consider a, e, i, o, u as vowels for this Kata (but not y).
The input string will only consist of lower case letters and/or spaces.*/

class VowelCount {

    fun count(string: String): Int {
        var vowelsInString: Int = 0
        string.split("").map {
            if (it in listOf("a", "e", "i", "o", "u")) {
                vowelsInString += 1
            }
        }
        return vowelsInString
    }

}