class StopSpinningMyWords() {
    fun spinWords(sentence: String): String {

        return sentence.split(" ").map { word ->
            if (word.length > 4) word.reversed() else word
        }.joinToString(" ")
    }

}