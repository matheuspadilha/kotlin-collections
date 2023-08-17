package br.com.matheuspadilha

fun main(args: Array<String>) {
    val assistiramCursoAndroid: Set<String> = setOf("Padilha", "Carol", "Gui", "Maria")
    val assistiramCursoKotlin: Set<String> = setOf("Padilha", "Kevin", "Maria")
//    val assistiramAmbos: Set<String> = assistiramCursoAndroid + assistiramCursoKotlin
    val assistiramAmbos = mutableSetOf<String>()
    assistiramAmbos.addAll(assistiramCursoAndroid)
    assistiramAmbos.addAll(assistiramCursoKotlin)
    assistiramAmbos.add("Anne")
    assistiramAmbos.add("Anne")
    println(assistiramAmbos)

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}