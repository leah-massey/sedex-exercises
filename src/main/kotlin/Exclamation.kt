class Exclamation {
    fun vowelToEx(sentence: String): String {
       return sentence.map { if (it.lowercase() in "aeiou") '!' else it }.joinToString("")
    }
}