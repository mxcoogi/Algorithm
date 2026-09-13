class Solution {
    var maxLeft: Int = 0;
    var maxLen: Int = 0;

fun longestPalindrome(s: String): String {
    if(s.length < 2){
        return s
    }

    for(i in 0 until  s.length-1){
        isPalindrome(s, i, i+1)
        isPalindrome(s, i, i+2)
    }
    return s.substring(maxLeft, maxLeft + maxLen)
}
fun isPalindrome(s: String, i : Int, j: Int){
    var left: Int = i
    var right: Int = j
    while(left >= 0 && right < s.length && s[left] == s[right]) {
        left--
        right++
    }
    if(maxLen < right - left - 1) {
        maxLen = right - left - 1
        maxLeft = left+1
    }
}
}