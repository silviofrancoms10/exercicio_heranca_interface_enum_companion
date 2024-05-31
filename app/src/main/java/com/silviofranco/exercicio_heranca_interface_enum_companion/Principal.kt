package com.silviofranco.exercicio_heranca_interface_enum_companion

class Principal {

}

fun main() {
    val hb20 = Carro("HB20", 4)
    hb20.acelerar()
    val cg125 = Moto("CG125", 2,Status.FUNCIONANDO ,true)
    cg125.acelerar()
    cg125.acelerar(10)
    hb20.recuperarStatus()
    Carro.exibeMensagemVelocidadeMaximaLei()
    Moto.exibeMensagemVelocidadeMaximaLei()
}
