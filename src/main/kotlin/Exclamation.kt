class Exclamation {
    fun vowelToEx(sentence: String): String {

        var updatedSentence: MutableList<Char> = mutableListOf()

        sentence.forEach{
            if (it in "aeiou") {
                updatedSentence.add('!')
            } else {
                updatedSentence.add(it)
            }
        }

        return updatedSentence.joinToString("")


    }
}