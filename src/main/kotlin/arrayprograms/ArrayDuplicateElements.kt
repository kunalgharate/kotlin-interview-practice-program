package arrayprograms
    object ArrayDuplicateElements {

        var arrayitems = arrayOf(45, 65, 33, 45, 33, 11)


        fun findDuplicates() {
            val duplicatedArray = mutableListOf<Int>()
            var a = 0
            val countMap = mutableMapOf<Int, Int>() // Create a map to count occurrences

            while (a < arrayitems.size) {
                val currentItem = arrayitems[a]

                // Increment the count for the current item in the map
                countMap[currentItem] = (countMap[currentItem] ?: 0) + 1

                if (countMap[currentItem] == 2) { // Check if the element occurs exactly twice
                    duplicatedArray.add(currentItem)
                }

                a++
            }

            println(duplicatedArray.toString())
        }
        }