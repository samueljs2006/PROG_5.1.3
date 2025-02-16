class Coche  : Vehiculo, EncendidoApagado {

    override var kmHora = 0.0
        set(value) {
            val calculo = field - value
            if (field < 0){
                field = 0.0
            }else{
                field = calculo            }
        }


    override var motorEncendido = false

    override fun encender() {
        println("El Coche esta encendido")
    }

    override fun apagar() {
        println("El coche esta apagado")
    }

    override fun acelerar(valor: Int) {
        if (motorEncendido){
            kmHora += valor
        }


    }

    override fun frenar(valor: Int) {
        if (motorEncendido){
            kmHora -= valor
        }

    }
}