package br.com.matheuspadilha.test

fun testSet() {
    val assistiramCursoAndroid: Set<String> = setOf("Padilha", "Carol", "Gui", "Maria")
    val assistiramCursoKotlin: Set<String> = setOf("Padilha", "Kevin", "Maria")
//    val assistiramAmbos: Set<String> = assistiramCursoAndroid + assistiramCursoKotlin
    val assistiramAmbos = mutableSetOf<String>()
    assistiramAmbos.addAll(assistiramCursoAndroid)
    assistiramAmbos.addAll(assistiramCursoKotlin)
    assistiramAmbos.add("Anne")
    assistiramAmbos.add("Anne")
    println(assistiramAmbos)

    println(assistiramCursoAndroid + assistiramCursoKotlin)
    println(assistiramCursoAndroid.union(assistiramCursoKotlin))
    println(assistiramCursoAndroid union assistiramCursoKotlin)

    println(assistiramCursoAndroid - assistiramCursoKotlin)
    println(assistiramCursoAndroid subtract assistiramCursoKotlin)

    println(assistiramCursoAndroid intersect assistiramCursoKotlin)

    val assistiramList = assistiramAmbos.toMutableList()
    assistiramList.add("Matheus")
    println(assistiramList)
}