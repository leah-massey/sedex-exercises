class CharacterRepeat {
    fun longestRepeat(str: String): Pair<String?, Int> {

        if (str.isEmpty()) {
            return Pair(null, 0)
        }

        val groupedChars: MutableList<String> = mutableListOf()
        var currentGroup = StringBuilder()

        // sort letters into groups
        str.forEachIndexed { index, letter ->
            if(index > 0 && letter != str[index -1]) {
                // if the character has changed
                groupedChars.add(currentGroup.toString())
                currentGroup = StringBuilder().append(letter)
            } else {
                // if the character has stayed the same
                currentGroup.append(letter)
            }
        }
        // add final group
        groupedChars.add(currentGroup.toString())

        val longestRepeatedLetter: String = groupedChars.max()

        return Pair(longestRepeatedLetter.substring(0,1), longestRepeatedLetter.length)
    }
}