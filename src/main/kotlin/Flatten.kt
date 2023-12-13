class Flatten {

    var listOfInts: MutableList<Int> = mutableListOf()
    var listOfLists: MutableList<List<*>> = mutableListOf()

    fun getFlatList(data: List<Any?>): List<Any> { // why does this only work if I use type Any?
        //empty my list of Lists
        listOfLists = mutableListOf()

        data.forEach {
            if (it is Int) {
                listOfInts.add(it)
            }  else if (it is List<*>){
                listOfLists.add(it)
                    getFlatList(listOfLists.flatten())
            }
        }
        return listOfInts
    }
}