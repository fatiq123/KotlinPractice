package practiceproject

import java.util.*

fun main() {

    for (i in 0..5){
        println()
        // this is for free some space on start
    }

    val scanner = Scanner(System.`in`)
    var choice: Int

    do {
        home()

        choice = scanner.nextInt()

        when (choice) {
            1 -> {
                for (i in 0..2){
                    println()
                }
                addStudent()

                // After adding a student, prompt the user with a menu
                var addAnother: String
                do {
                    print("Do you want to add another student? (y/n): ")
                    addAnother = scanner.next().lowercase(Locale.getDefault())
                    // Int ka liya Scanner.nextInt() aur string ka liya scanner.next()
                    // and lowercase y/n ka liya agar Y/N hota to UpperCase
                } while (addAnother != "y" && addAnother != "n")

                if (addAnother == "y") {
                    continue // go back to the start of the loop
                }
            }
            2 -> {
                for (i in 0..2){
                    println()
                }
                showStudent()
            }
            3 -> {
                for (i in 0..2){
                    println()
                }
                searchStudent()
            }
            4 -> {
                for (i in 0..2){
                    println()
                }
                updateStudent()
            }
            5 -> {
                for (i in 0..2){
                    println()
                }
                deleteStudent()
            }
            else -> println("Invalid choice.")
        }
    } while (choice != 6)








//    while (true){
//     when(readlnOrNull()){
//        "1" -> addStudent()
//        "2" -> println("You selected Option 2")
//        "3" -> println("You selected Option 3")
//        "4" -> println("You selected Option 4")
//        "5" -> println("You selected Option 5")
//        else -> println("Invalid option selected")
//        }
//    }

}

fun home(){
    println("===============================")
    println("School Management System.")
    println("1.Add Student.")
    println("2.Show Student.")
    println("3.Search Student.")
    println("4.Update Student.")
    println("5.Delete Student.")
    println("Exit.")
    print("Choose From Following Options: ")
}

