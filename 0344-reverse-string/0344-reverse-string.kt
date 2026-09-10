class Solution {
    fun reverseString(s: CharArray): Unit {
    var left: Int = 0
    var right: Int = s.size-1
    var temp: Char
    while(left < right) {
        temp = s[left]
        s[left] = s[right]
        s[right] = temp
        left++
        right--
    } 
}
}