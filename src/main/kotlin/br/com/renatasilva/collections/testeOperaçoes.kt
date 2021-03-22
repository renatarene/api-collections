package br.com.renatasilva.collections

fun main() {
    val salarios = doubleArrayOf(1000.0,2250.0, 4000.0)
    for (salario in salarios){
        println(salario)
    }
    println("..........................")
    println("Maior salário: ${salarios.maxOrNull()}")
    println("Menor salário: ${salarios.minOrNull()}")
    println("Média salarial: ${salarios.average()}")

    val salarioMaiorQue2500 = salarios.filter { it > 2500.0 }
    println("................................")
    salarioMaiorQue2500.forEach{println(it)}
    println("..........................")

    println(salarios.find { it == 2250.0 })
    println(salarios.find { it == 500.0 })

}