data class User(val name: String, val id: Int)

fun main() {
    val user = User("Alex", 1)

    // Membuat salinan yang tepat dari User
    println(user.copy())
    // User(name=Alex, id=1)

    // Membuat salinan User dengan nama: "Max"
    println(user.copy("Max"))
    // User(name=Max, id=1)

    // Membuat salinan User dengan id: 3
    println(user.copy(id = 3))
    // User(name=Alex, id=3)
}