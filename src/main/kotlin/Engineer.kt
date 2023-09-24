open class Engineer(
    var major: Major,
    var level: Level,
    name: String,
    surname: String,
    id: ID,
    address: Address
) : Employee(name, surname, id, address) {


    fun design() {
        println("$name is designing")
    }

    fun createSystem(){
        println("$name is creating system")
    }

    fun makePlan(){
        println("$name is making plan")
    }
}