import java.io.File

fun main() {
    val file = File("resources/verbs100.txt")

    val list = mutableListOf<Article>()

    file.forEachLine { line ->
        val parts = line.split("%")
        val article = Article(parts[0], parts[1])
        list.add(article)
    }

    list.forEach { println(it) }
}

data class Article(val kz: String, val ru: String) {
    override fun toString() = "$kz = $ru"
}
