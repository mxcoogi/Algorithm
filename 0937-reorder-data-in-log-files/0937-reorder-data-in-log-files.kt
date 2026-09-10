class Solution {
    fun reorderLogFiles(logs: Array<String>): Array<String> {
    var strLog: MutableList<String> = ArrayList();
    var numLog: MutableList<String> = ArrayList();

    for (log in logs) {
        if(log.split(" ")[1][0].isLetter()){
            strLog.add(log)
        }else{
            numLog.add(log)
        }
    }
    strLog.sortWith({s1: String, s2: String ->
        val x1 = s1.split(" ", limit = 2)
        val x2 = s2.split(" ", limit = 2)
        val compared = x1[1].compareTo(x2[1])
        if (compared == 0) {
            x1[0].compareTo(x2[0])
        }else{
            compared
        }
    })
    strLog.addAll(numLog)
    return strLog.toTypedArray();
}
}