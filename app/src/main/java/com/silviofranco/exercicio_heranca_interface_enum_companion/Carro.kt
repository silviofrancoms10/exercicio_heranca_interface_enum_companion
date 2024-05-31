package com.silviofranco.exercicio_heranca_interface_enum_companion

class Carro(modelo: String="não instanciado",qtdRodas: Int=0, status: Status = Status.FUNCIONANDO): Veiculo(modelo, qtdRodas, status){

    companion object{
        const val velocidadeMaximaLei: Int = 150

        fun exibeMensagemVelocidadeMaximaLei() {
            println("A velocidade máxima da lei é $velocidadeMaximaLei")
        }
    }

    override fun acelerar() {
        println("Acelerar $modelo com $qtdRodas rodas")
    }

    fun acelerar(intensidade: Int) {
        println("Acelerar $modelo com $qtdRodas rodas e intensidade $intensidade")
    }

    override fun recuperarStatus() {
        println("O status do veículo é: $status")
    }
}