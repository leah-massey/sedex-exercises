import java.lang.Character.UnicodeScript

class AlphabeticalSequence {
    fun alphaSeq(string: String): String {
        val str: String = string

        val chars = str.toCharArray()

        val finalSeq: MutableList<String> = mutableListOf()
//
      for (char in chars) {
            val firstLetter: Char = char.uppercaseChar()
            val letterValue: Int = char.code - 97 // eg. 2
            val letterMultiples: String = char.toString().repeat(letterValue)

            val completedCharacter: String = "$firstLetter$letterMultiples"
            finalSeq.add(completedCharacter)
        }
//
//
        return finalSeq.joinToString("")

    }
}