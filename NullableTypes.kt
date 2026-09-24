fun main() {
    // neverNull has String type
    var neverNull: String = "This can't be null"

    // nullable has nullable String type
    var nullable: String? = "You can keep a null here"
    // This is OK
    nullable = null

    // notNull doesn't accept null values
    fun strLength(notNull: String): Int {
        return notNull.length
    }

    println(strLength(neverNull)) // 18
    // println(strLength(nullable)) // Throws a compiler error jika di-uncomment
}