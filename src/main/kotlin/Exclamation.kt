class Exclamation {
    fun vowelToEx(sentence: String): String {
       return sentence.map { if (it in "aeiou") '!' else it }.joinToString("")
    }
}