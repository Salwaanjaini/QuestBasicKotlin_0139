fun main() {
    println((1..4).toList())          // 1, 2, 3, 4
    println((1..<4).toList())         // 1, 2, 3
    println((4 downTo 1).toList())    // 4, 3, 2, 1
    println((1..5 step 2).toList())   // 1, 3, 5
    println(('a'..'d').toList())      // a, b, c, d
    println((('z' downTo 's') step 2).toList()) // z, x, v, t
}