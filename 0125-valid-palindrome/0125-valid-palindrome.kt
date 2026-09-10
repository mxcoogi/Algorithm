class Solution {
    fun isPalindrome(s: String): Boolean {
    var left: Int = 0
    var right: Int = s.length - 1;
    while (left <= right) {
        if(!s[left].isLetterOrDigit()){
            left++
            continue
        }
        if(!s[right].isLetterOrDigit()){
            right--
            continue
        }
        if(s[left].lowercaseChar() != s[right].lowercaseChar()){
            return false
        }
        left++
        right--
    }
    return true
}
}