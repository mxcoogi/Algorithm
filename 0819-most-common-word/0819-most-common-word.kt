class Solution {
    fun mostCommonWord(paragraph: String, banned: Array<String>): String {
    var map = mutableMapOf<String, Int>()
    var set = mutableSetOf<String>()
    banned.forEach {
        set.add(it.lowercase())
    }
    paragraph.replace("\\W+".toRegex(), " ")
        .trim()
        .lowercase()
        .split(" ")
        .forEach {
            if(!set.contains(it)) {
                map[it] = map.getOrDefault(it, 0) + 1
            }
        }
    return map.maxBy { it.value }.key
}
}