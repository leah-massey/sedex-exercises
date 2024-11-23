class CountingDuplicates {
    fun duplicateCount(text: String): Int {
        val newList: MutableList<String> = mutableListOf()
        val duplicatedLetters: MutableList<String> = mutableListOf()

        val letters: List<String> = text.split("").drop(1).dropLast(1)
        println(letters)

        letters.forEach{ letter ->
            if (!newList.contains(letter.lowercase())){
                newList.add(letter)
            } else if (!duplicatedLetters.contains(letter)) {
                duplicatedLetters.add(letter)
            }
        }
        return duplicatedLetters.count()
    }

}