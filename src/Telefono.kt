class Telefono (val marca : String = "Desconocido" , val modelo : String = "Desconocido"): EncendidoApagado , DispositivoElectronico {

    override fun encender() {
        println("El telefono esta encendido")
    }

    override fun apagar() {
        println("El telefono esta apagado")
    }

    override fun reiniciar() {
        println("El telefono esta reiniciando")
    }
}