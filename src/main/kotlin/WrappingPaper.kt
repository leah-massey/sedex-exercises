class WrappingPaper {
    fun paperNeeded(l: Int, w: Int, h: Int): Int {

        val sides: List<Int> = listOf(l*w, w*h, h*l).sorted()
        var area = 0

        sides.forEach { area += 2*it}
        area += sides[0]

        return area
    }
}