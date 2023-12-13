class Flatten {
    fun getFlatList(data: List<Any>): List<Any?> {

//        var mutableData: MutableList<List<*>> = mutableListOf() // listOf(listOf(2))


        var listOfInts: MutableList<Int> = mutableListOf() // listOf(2)
        var listOfLists: MutableList<List<*>> = mutableListOf()  // I want to push



        data.forEach {     // listOf(listOf(1, 1), 2, listOf(3, listOf(5, 8)))
            if (it is Int) {
                listOfInts.add(it)
                 println("This is mutableData now: $listOfLists")
            }  else if (it is List<*>){
                listOfLists.add(it)
                println("this is mutable data after adding a list $listOfLists")
            }
        }

        println("this is the listOfLists: $listOfLists")
        listOfLists += listOfInts
        println("this is the listOfLists with the int list added: $listOfLists")

        val flattenedList = listOfLists.flatten()
        println("this is the flattenedList: $flattenedList")

        return(flattenedList)
    }
}