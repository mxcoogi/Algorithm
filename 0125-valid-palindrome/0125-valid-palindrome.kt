class Solution {
    fun isPalindrome(s: String): Boolean {
    val lowercase = s.replace(Regex("[^A-Za-z0-9]"), "").lowercase()
    var left: Int = 0
    var right: Int = lowercase.length - 1
    while (left <= right) {
        if(lowercase[left] != lowercase[right]){
            return false
        }
        left++
        right--
    }
    return true
}
}