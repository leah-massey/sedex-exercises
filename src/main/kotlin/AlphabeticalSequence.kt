import java.lang.Character.UnicodeScript

class AlphabeticalSequence {
    fun alphaSeq(string: String): String {

        var chars: CharArray = string.lowercase().toCharArray()
        chars.sort()

        val finalSeq: MutableList<String> = mutableListOf()

//      for (char in chars) {
//
//            val firstLetter: Char = char.uppercaseChar()
//            val letterCount: Int = char.code - 97
//            val letterMultiples: String = char.toString().repeat(letterCount)
//
//            val completedString: String = "$firstLetter$letterMultiples"
//            finalSeq.add(completedString)
//        }

        chars.forEach {
//
            val firstLetter: Char = it.uppercaseChar()
            val letterCount: Int = it.code - 97
            val letterMultiples: String = it.toString().repeat(letterCount)

            val completedString: String = "$firstLetter$letterMultiples"
            finalSeq.add(completedString)
        }



        println(finalSeq.toList())

        return finalSeq.joinToString(",")

    }
}