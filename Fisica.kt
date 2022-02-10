class Fisica {


    fun calcularForcaPeso(massa:Float, gravidade:Float): Float {
        return massa * gravidade
    }
    fun calcularForcaCentripeta(massa:Float, velocidade:Float, raioDaCurva:Float): Float {
        return massa * (velocidade * velocidade / raioDaCurva)
    }
    fun calcularImpulso(forcaNewton:Float, tempoInicial:Float, tempoFinal:Float): Float {
        return forcaNewton * (tempoFinal - tempoInicial)
    }
    fun calcularForcaElastica(forcaNewton:Float, deslocamentoEmMetros:Float): Float {
        return forcaNewton * deslocamentoEmMetros
    }
    fun calcularVelocidadeMedia(velocidadeInicial:Float, velocidadeFinal:Float, tempoInicial:Float, tempoFinal:Float ): Float {
        return velocidadeFinal - velocidadeInicial / tempoFinal - tempoInicial

    }fun calcularMru(espacoInicial:Float, velocidade:Float, tempoInicial:Float, tempoFinal:Float): Float {
        return espacoInicial + velocidade * (tempoFinal - tempoInicial)
    }
    fun calcularMruv(espacoInicial:Float, velocidadeInicial:Float, tempo:Float, aceleracao:Float): Float {
        return espacoInicial + velocidadeInicial * tempo + ((aceleracao * (tempo * tempo))/2)
    }
    }


