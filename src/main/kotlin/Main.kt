import game.*
fun main(args: Array<String>) {
    println("Hello World!")
    val grön = GreenPiece()


    println(grön.place)
    grön.move()
    println(grön.place)

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}