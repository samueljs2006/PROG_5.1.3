fun main() {
    // Creación y prueba del teléfono
    val miTelefono = Telefono("Samsung", "Galaxy S21")
    miTelefono.encender()
    miTelefono.reiniciar()
    miTelefono.apagar()

    println("------------------")

    // Creación y prueba de la lavadora
    val miLavadora = Lavadora()
    miLavadora.encender()
    miLavadora.apagar()

    println("------------------")

    // Creación y prueba del coche
    val miCoche = Coche()
    miCoche.encender()
    miCoche.motorEncendido = true // Encender el motor
    miCoche.acelerar(50)
    println("Velocidad del coche: ${miCoche.kmHora} km/h")
    miCoche.frenar(60) // Prueba de frenado más allá de 0
    println("Velocidad del coche después de frenar: ${miCoche.kmHora} km/h")
    miCoche.apagar()
}
