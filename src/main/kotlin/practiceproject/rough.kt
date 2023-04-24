//import java.util.*
//
//data class Student(val name: String, val age: Int)
//
//fun main() {
//    val scanner = Scanner(System.`in`)
//    val students = mutableListOf<Student>()
//    var choice: Int
//
//    do {
//        println("Menu")
//        println("1. Add student")
//        println("2. View students")
//        println("3. Quit")
//        print("Enter your choice: ")
//        choice = scanner.nextInt()
//
//        when (choice) {
//            1 -> {
//                print("Enter student name: ")
//                val name = scanner.next()
//                print("Enter student age: ")
//                val age = scanner.nextInt()
//                students.add(Student(name, age))
//                println("Student added.")
//
//                // After adding a student, prompt the user with a menu
//                var addAnother: String
//                do {
//                    print("Do you want to add another student? (y/n): ")
//                    addAnother = scanner.next().toLowerCase()
//                } while (addAnother != "y" && addAnother != "n")
//
//                if (addAnother == "y") {
//                    continue // go back to the start of the loop
//                }
//            }
//            2 -> {
//                println("Students:")
//                students.forEach { println("${it.name}, ${it.age}") }
//            }
//            3 -> println("Goodbye!")
//            else -> println("Invalid choice.")
//        }
//    } while (choice != 3)
//}
