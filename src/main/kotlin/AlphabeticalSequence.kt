import java.lang.Character.UnicodeScript

class AlphabeticalSequence {
    fun alphaSeq(string: String): String {
        val str: String = string

        val chars: List<String> = str.split("")

        val finalSeq: MutableList<String> = mutableListOf()

        for (char in chars) {
            val letter: String = char.uppercase()
            val letterMultiples: String = char

            val completedCharacter: String = "$letter$letterMultiples"
            finalSeq.add(completedCharacter)
        }
        println(finalSeq)

        return finalSeq.joinToString("")

    }
}