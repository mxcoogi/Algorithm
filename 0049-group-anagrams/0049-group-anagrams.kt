class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
    val map : MutableMap<String,MutableList<String>> = mutableMapOf()
    strs.forEach {
        val joinToString = it.toCharArray().sorted().joinToString("")
        map.getOrPut(joinToString, { mutableListOf() }).add(it)
    }
    return map.values.toList()
}
}