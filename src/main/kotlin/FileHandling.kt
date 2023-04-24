import java.io.FileReader
import java.io.FileWriter

fun main() {

    menu()
    val choice = readlnOrNull()?.toInt()
    val message: String?

    when(choice){
        1 -> {
            println("Enter message")
            message = readlnOrNull().toString()
            writeToFile(message)
        }
        2 -> {
            println("Reading")
            readFromFile()
        }
        3 -> {
            println("Exiting")
        }
    }
    // ham yahan pa do while loop bi chala sakta han ta ka user console par hi raha jab tak choice 4 ni ho jati
}


fun menu(){
    println("Enter From Following Options...")
    println("1. Add to File")
    println("2. Read from File")
    println("3. Exit \n")
}

fun writeToFile(message: String){

    try {

        var writer = FileWriter("file_handling.txt",true)
        writer.write(message + "\n")
        writer.close()

    }catch (e: Exception){
        println("Exception: $e")
    }
}

fun readFromFile(){
    var reader = FileReader("file_handling.txt")
    var char: Int?

    try {
        do {
            char = reader.read()
            print(char.toChar())
        }
        while (char != -1)  // to read until end of file

    }
    catch (e: Exception){
        println(e.message)
    }
}