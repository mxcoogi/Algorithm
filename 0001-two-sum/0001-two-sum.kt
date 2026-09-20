class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = mutableMapOf<Int, Int>()
        for ((index, value) in nums.withIndex()) {
            val need = target - value
            if(map.containsKey(need) && map[need] != index){
                return intArrayOf(map[need]!!, index)
            }else{
                map[value] = index
            }
        }
        return intArrayOf()
    }
}