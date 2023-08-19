package br.com.matheuspadilha

fun main(args: Array<String>) {
    val pedidos = listOf(
        Pedido(1, 20.0),
        Pedido(2, 60.0),
        Pedido(3, 40.0),
        Pedido(4, 70.0),
        Pedido(5, 40.0)
    )
    println(pedidos)

//    val pedidosMapeados = pedidos.associate { pedido -> Pair(pedido.numero, pedido) }
    val pedidosMapeados = pedidos.associateBy { pedido -> pedido.numero }
    println(pedidosMapeados)
    println(pedidosMapeados[1])

    val pedidosFreteGratis = pedidos.associateWith { pedido -> pedido.valor > 50.0 }
    println(pedidosFreteGratis)
    println(pedidosFreteGratis[Pedido(numero = 2, valor = 60.0)])

//    val mapa = pedidos.associateBy { pedido -> pedido.valor > 50.0 }
//    println(mapa)
//    println(mapa[true])

    val pedidosFreteGratisAgrupados = pedidos.groupBy { pedido -> pedido.valor > 50.0 }
    println(pedidosFreteGratisAgrupados)
    println(pedidosFreteGratisAgrupados[true])

    val nomes = listOf("Matheus", "Caroxa", "Maya", "Emmett")
    val agenda = nomes.groupBy { nome -> nome.first() }

    println(agenda)
    println(agenda['M'])

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}

data class Pedido(val numero: Int, val valor: Double)

