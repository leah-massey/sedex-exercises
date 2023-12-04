class WrappingPaper {
    fun paperNeeded(l: Int, w: Int, h: Int): Int {
        val area = 2*l*w + 2*w*h + 2*h*l + 1
        return area
    }
}