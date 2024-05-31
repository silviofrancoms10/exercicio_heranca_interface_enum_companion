package com.silviofranco.exercicio_heranca_interface_enum_companion

class Moto(modelo: String="não instanciado", qtdRodas: Int= 0, status: Status = Status.FUNCIONANDO, override val motorEletrico: Boolean = false): Veiculo(modelo,qtdRodas, status), Eletrificado{

    companion object{
        const val velocidadeMaximaLei: Int = 150

        fun exibeMensagemVelocidadeMaximaLei() {
            println("A velocidade máxima da lei é $velocidadeMaximaLei")
        }
    }

    fun motoreEletrico(){
        println("Rodando com motor elétrico? $motorEletrico")
    }
    override fun acelerar() {
        println("Acelerar $modelo com $qtdRodas rodas")
        motoreEletrico()
    }

    fun acelerar(intensidade: Int) {
        println("Acelerar $modelo com $qtdRodas rodas e intensidade $intensidade")
        motoreEletrico()
    }

    override fun recuperarStatus() {
        println("O status do veículo é: $status")
    }
}