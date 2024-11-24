class CountingDuplicates {
    fun duplicateCount(text: String): Int {

        val newList: MutableList<String> = mutableListOf()
        val duplicatedLetters: MutableList<String> = mutableListOf()
        val letters: List<String> = text.split("").drop(1).dropLast(1)

        letters.forEach{ letter ->
            val lowercaseLetter = letter.lowercase()
            if (!newList.contains(lowercaseLetter)){
                newList.add(lowercaseLetter)
            } else if (newList.contains(lowercaseLetter) && !duplicatedLetters.contains(lowercaseLetter)) {
                duplicatedLetters.add(lowercaseLetter)
            }
        }
        return duplicatedLetters.count()
    }
}