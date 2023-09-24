class MechanicalEngineer(
    var grade: Int,
    var structureAbility: Boolean,
    var sector: String,
    name: String,
    surname: String,
    id: ID,
    address: Address,
    major: Major,
    level: Level
) : Engineer(major, level, name, surname, id, address) {

    fun manageEmployee(){
        println("$name $surname is managing the employees")
    }

    fun setMoney(){
        println("The money is prepared by $name $surname")
    }
}