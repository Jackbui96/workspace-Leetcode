package main

fun romanToInt(s: String): Int {

    var sum = 0
    val mapper: HashMap<Char, Int> = HashMap()
    mapper['I'] = 1
    mapper['V'] = 5
    mapper['X'] = 10
    mapper['L'] = 50
    mapper['C'] = 100
    mapper['D'] = 500
    mapper['M'] = 1000

    for (i in s.indices) {
        val value = mapper[s[i]]
        if (i + 1 != s.length) {
            if (value!! >= mapper[s[i+1]]!!) {
                sum += value
            } else {
                sum -= value
            }
        } else {
            sum += value!!
        }
    }
    return sum
}