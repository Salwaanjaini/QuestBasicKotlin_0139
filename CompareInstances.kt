data class User(val name: String, val id: Int)

fun main() {
    val user = User("Alex", 1)
    val secondUser = User("Alex", 1)
    val thirdUser = User("Max", 2)

    // Membandingkan User dengan User kedua
    println("user == secondUser: ${user == secondUser}")
    // user == secondUser: true

    // Membandingkan User dengan User ketiga
    println("user == thirdUser: ${user == thirdUser}")
    // user == thirdUser: false
}