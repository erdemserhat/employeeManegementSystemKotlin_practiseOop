class SoftwareEngineer(
    major: Major,
    level: Level,
    name: String,
    surname: String,
    id: ID,
     address: Address,
    var project:Array<Project>,
    var collobrationAbility:Boolean,
    var usedLanguage: Language
):Engineer(major,level,name,surname,id,address),Workable {

    override fun requestBonus() {
        println("overrided method")
    }
}