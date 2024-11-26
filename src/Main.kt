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
//        println(article.kz + "=" + article.ru)
        println(article)


    }
}

class Article {
    var kz: String = ""
    var ru: String = ""

    //article.kz + "=" + article.ru
    /*1
    override fun toString(): String {
        return this.kz + "=" + this.ru
    }
    */

    /*2
    override fun toString(): String {
        return kz + "=" + ru
    }
    */

    /*3
    override fun toString(): String {
        return "$kz = $ru"
    }
    */

    override fun toString()= "$kz = $ru"

}