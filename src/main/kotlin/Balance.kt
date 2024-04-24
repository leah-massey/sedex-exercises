class Balance(input: String) {
    fun isBalanced(input: String): Boolean {
        if (input.length % 2 == 0) {
            return true
        } else {
            return false
        }
    }
}