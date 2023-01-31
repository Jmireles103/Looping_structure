fun main() {
    var userSelection = 0

    do {
        println("1.) Bagel, Plain ")
        println("2.) Bagel, Toasted, amd Plain")
        println("3.) Bagel, Toasted, and cream cheese")
        println("4.) Bagel, cream cheese")
        println("5.) Exit")

        print("Enter Choice:")
        if (userSelection > 5)
            println(" Invalid Choice please try again")
        userSelection = readln().toInt()
        println("You have selected option: $userSelection")
    }while (userSelection != 5)


}