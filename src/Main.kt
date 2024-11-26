import java.io.File

fun main() {
    val file = File("resources/verbs100.txt")
    file.forEachLine { line ->
        val parts = line.split("%")
        val partKz = parts[0]
        val partRu = parts[1]
//        println(partKz + "=" + partRu)

        /* 5
        val article = Article()
        article.kz = partKz
        article.ru = partRu
        */

        //5
        val article = Article(partKz, partRu)

//        println(article.kz + "=" + article.ru)
        println(article)


    }
}

data class Article(val kz: String, val ru: String){
    override fun toString()= "$kz = $ru"
}

class ArticleOld {
    // 5 var kz: String = ""
    // 5 var ru: String = ""

    //5
    val kz: String
    val ru: String
    constructor(kz: String, ru: String) {
        this.kz = kz
        this.ru = ru
    }


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

    //4
    override fun toString()= "$kz = $ru"

}

