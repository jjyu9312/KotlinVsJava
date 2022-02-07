class Kotlin_Function {

    fun main() {
        /* apply 함수 */
        var person = Person_Kotlin("", "").apply {
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
    }
}

data class Person_Kotlin(
    var firstName : String,
    var lastName : String
)