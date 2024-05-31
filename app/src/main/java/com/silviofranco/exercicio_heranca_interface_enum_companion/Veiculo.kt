package com.silviofranco.exercicio_heranca_interface_enum_companion

abstract class Veiculo(val modelo: String, val qtdRodas: Int, val status: Status) {

    abstract fun acelerar()
    abstract fun recuperarStatus()



}