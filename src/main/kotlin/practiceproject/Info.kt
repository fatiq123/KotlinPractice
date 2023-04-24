package practiceproject

// Data class for all properties of a Student
data class Student(var studentFirstName:String,
                   var studentLastName:String,
                   var studentAge:Int,
                   var studentAddress:String,
                   var studentPhoneNo:String,
                   var studentRollNo:Int)

// List to store a complete student related information
val studentList = mutableListOf<Student>()

fun addStudent(){
    // Prompt user to enter student details
    for (i in 0..2){
        println()
    }
    println("Enter student details...")
    print("First Name: ")
    val firstName = readlnOrNull() ?: ""
    print("Last Name: ")
    val lastName = readlnOrNull() ?: ""
    print("Age: ")
    val age = readlnOrNull()?.toIntOrNull() ?: 0
    print("Address: ")
    val address = readlnOrNull() ?: ""
    print("Phone: ")
    val phone = readlnOrNull() ?: ""
    print("Roll No: ")
    val rollNo = readlnOrNull()?.toIntOrNull() ?: 0

    // Create student object
    //val student = Student(firstName, lastName, address, phone, rollNo)

    studentList.add(Student(firstName,lastName,age,address,phone,rollNo))

    // Print student details
    println("\nNew student added:")

}

fun showStudent(){
    for (i in 0..2){
        println()
    }
    for (student in studentList){

        println("First_Name: ${student.studentFirstName}")
        println("Last_Name: ${student.studentLastName}")
        println("Age: ${student.studentAge}")
        println("Address: ${student.studentAddress}")
        println("Phone No: ${student.studentPhoneNo}")
        println("Roll No: ${student.studentRollNo}")

    }
}

fun searchStudent(){

    print("Enter roll number to search for: ")
    val rollNoToSearch = readlnOrNull()?.toIntOrNull()

    if (rollNoToSearch == null) {
        println("Invalid input, please enter a number")
    } else {
        val search = studentList.find { it.studentRollNo == rollNoToSearch }

        if (search != null) {
            println("Found student: ${search.studentLastName.plus(search.studentLastName)}")
        } else {
            println("No student found with roll number $rollNoToSearch")
        }
    }

}


fun updateStudent(){

    print("Enter roll number to update: ")
    val rollNoToUpdate = readlnOrNull()?.toIntOrNull()

    if (rollNoToUpdate == null) {
        println("Invalid input, please enter a number")
    } else {
        val studentToUpdate = studentList.find { it.studentRollNo == rollNoToUpdate }

        if (studentToUpdate == null) {
            println("No student found with roll number $rollNoToUpdate")
        } else {

            print("Enter new First Name for ${studentToUpdate.studentFirstName}: ")
            val firstName = readlnOrNull()
            studentToUpdate.studentFirstName = firstName ?: studentToUpdate.studentFirstName

            print("Enter new Last Name for ${studentToUpdate.studentLastName}: ")
            val lastName = readlnOrNull()
            studentToUpdate.studentLastName = lastName ?: studentToUpdate.studentLastName

            print("Enter new Age for ${studentToUpdate.studentAge}: ")
            val age = readlnOrNull()?.toIntOrNull()
            studentToUpdate.studentAge = age ?: studentToUpdate.studentAge

            print("Enter new Address for ${studentToUpdate.studentAddress}: ")
            val address = readlnOrNull()
            studentToUpdate.studentAddress = address ?: studentToUpdate.studentAddress

            print("Enter new Phone No for ${studentToUpdate.studentPhoneNo}: ")
            val phone = readlnOrNull()
            studentToUpdate.studentPhoneNo = phone ?: studentToUpdate.studentPhoneNo

            print("Enter new Roll No for ${studentToUpdate.studentRollNo}: ")
            val rollNo = readlnOrNull()?.toIntOrNull()
            studentToUpdate.studentRollNo = rollNo ?: studentToUpdate.studentRollNo


            println("Student Updated Successfully: $studentToUpdate")
        }
    }

}

fun deleteStudent(){

    print("Enter Roll_No to Delete specific Student: ")
    val rollNoToDelete = readlnOrNull()?.toIntOrNull()

    if (rollNoToDelete == null) {
        println("Invalid input, please enter a correct Roll_No number")
    } else {
        val delete = studentList.size
        studentList.removeIf { it.studentRollNo == rollNoToDelete }

        //val delete = studentList.removeAt(rollNoToDelete)

        if (studentList.size == delete) {
            println("No student found with roll number $rollNoToDelete")
        } else {
            println("Student with roll number $rollNoToDelete deleted")
        }
    }

}