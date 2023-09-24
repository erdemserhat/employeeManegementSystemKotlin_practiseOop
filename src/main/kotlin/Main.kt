fun main(args: Array<String>) {
   val serhat=SoftwareEngineer(Major.SOFTWARE,Level.JUNIOR,"Serhat",
       "Erdem",ID(123,"Turkey",false),
       Address("Ankara","Kızılay",1,2),
       arrayOf(Project("Passwnote","Password Security"),Project(
           "CatchTom","Game")),true,Language.KOTLIN
       )

   if (serhat is Employee){
       println("${serhat.name} ${serhat.surname} is a Employee")
   }else{
       println("${serhat.name} ${serhat.surname} is not a Employee")
   }

    if (serhat is SoftwareEngineer){
        println("${serhat.name} ${serhat.surname} is a Software Engineer")
    }else{
        println("${serhat.name} ${serhat.surname} is not a Software Engineer")
    }

    serhat.createSystem()
    serhat.makePlan()
    serhat.goHome()
}