class CharacterRepeat {
    fun longestRepeat(str: String): Pair<String, Int> {

        if (str.isEmpty()) {
            return Pair("", 0)
        }

        var groupedChars: MutableList<String> = mutableListOf()
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

        groupedChars = groupedChars.sorted().toMutableList()

        val longestLetterRepeat: String = groupedChars[0][0].toString()
        val longestLetterCount: Int = groupedChars[0].length


        return Pair(longestLetterRepeat, longestLetterCount)
    }

}