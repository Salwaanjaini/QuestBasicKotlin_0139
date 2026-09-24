data class User(val name: String, val id: Int)

fun main() {
    val user = User("Alex", 1)

    // Secara otomatis menggunakan fungsi toString() agar output mudah dibaca
    println(user)
    // User(name=Alex, id=1)
}