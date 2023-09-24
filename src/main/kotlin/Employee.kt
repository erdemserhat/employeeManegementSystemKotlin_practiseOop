open class Employee(
    var name: String,
    var surname: String,
    var id: ID,
    var address: Address
):Workable {
    fun goHome() {
        println("$name $surname is going home")
    }

    fun goWork() {
        println("$name $surname is going work")
    }

    fun sleep() {
        println("$name $surname is sleeping")
    }

    fun login() {
        println("$name $surname is logged in")
    }

    fun logout() {
        println("$name $surname is logged out")
    }

    override fun work() {
        TODO("Not yet implemented")
    }

    override fun getSalary() {
        TODO("Not yet implemented")
    }

    override fun requestChanges() {
        TODO("Not yet implemented")
    }

    override fun requestBonus() {
        TODO("Not yet implemented")
    }


}