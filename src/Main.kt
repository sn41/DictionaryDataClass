import java.io.File

fun main() {
    val file = File("resources/verbs100.txt")
    file.forEachLine { line ->
        val parts = line.split("%")
        val partKz = parts[0]
        val partRu = parts[1]
//        println(partKz + "=" + partRu)
        val article = Article()
        article.kz = partKz
        article.ru = partRu
        println(article.kz + "=" + article.ru)

    }
}

class Article {
    var kz: String = ""
    var ru: String = ""
}