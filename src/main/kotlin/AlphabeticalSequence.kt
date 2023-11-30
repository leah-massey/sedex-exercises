import java.lang.Character.UnicodeScript

class AlphabeticalSequence {
    fun alphaSeq(string: String): String {

        val chars: CharArray = string.toCharArray()
        val finalSeq: MutableList<String> = mutableListOf()

      for (char in chars) {
            val firstLetter: Char = char.uppercaseChar()
            val letterCount: Int = char.code - 97 /
            val letterMultiples: String = char.toString().repeat(letterCount)

            val completedString: String = "$firstLetter$letterMultiples"
            finalSeq.add(completedString)
        }

        return finalSeq.joinToString("")

    }
}