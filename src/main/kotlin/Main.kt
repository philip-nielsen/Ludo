import game.*
fun main(args: Array<String>) {
    println("Hello World!")
    val grön = GreenPiece(0, 1, 0)
    println(grön.home)

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}