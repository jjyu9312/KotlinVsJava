class Kotlin_Function {

    fun main() {
        /* apply 함수 */
        var person1 = Person_Kotlin("", "").apply {
            firstName = "KIM"
            lastName = "KYUNGWOOK"
        }

        /* with 함수 */
        var person2 = Person_Kotlin("", "")
        with(person2) {
            firstName = "KIM"
            lastName = "KYUNGWOOK"
        }

        /* also 함수 */
        kotlin.random.Random.nextInt(100).also {
            println("getRandomInt() generated value $it")
        }

        kotlin.random.Random.nextInt(100).also { value ->
            println("getRandomInt() generated value $value")
        }

        /* let 함수 */
        val number : Int?
        val sumNumberStr = number?.let {
            "$(sum(10, it)}"
        }
    }
}

data class Person_Kotlin(
    var firstName : String,
    var lastName : String
)