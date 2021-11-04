/**
 *Se quiere crear una clase Cuenta la cual se caracteriza por tener asociado un número de cuenta y un saldo disponible. Además, se puede consultar el saldo disponible,
 *  recibir abonos y realizar pagos.
 * La Persona puede tener asociada hasta 3 cuentas bancarias, y debe tener un método que permita añadir cuentas (hasta 3 que es el máximo).
 *También debe contener un método que devuelva si la persona es morosa (si tienen alguna cuenta con saldo negativo).
 *En el programa principal, instanciar un objeto Persona con un DNI cualquiera, así como dos objetos cuenta, una sin saldo inicial
 * y otra con 700 euros. La persona recibe la nómina mensual, por lo que ingresa 1100 euros en la primera cuenta, pero tiene que pagar el alquiler de 750 euros con la segunda.
 * Imprimir por pantalla si la persona es morosa.
 * Posteriormente hacer una transferencia de una cuenta a otra (de forma que todos los saldos sean positivos) y mostrar por pantalla el estado de la persona.
 */
class Cuenta(
    var n_cuenta: String,
    var saldo: Double?

) {
    fun obtener_saldo(): String {
        var saldo_disponible: Double? = saldo
        return "Tu saldo es de $saldo_disponible"
    }
    fun recibir_abono(abono: Double): String {
        saldo = abono + saldo!!
        return "Te han abonado $abono, tu saldo es de $saldo"
    }
    fun realizar_pago(pago: Double): String {
        saldo = saldo?.minus(pago)
        return "Has pagado $pago tu saldo es de $saldo"
    }
}

class Persona(
    var dni: String,
    var vector_cuentas: Array<Cuenta?> = arrayOfNulls<Cuenta>(3)

){
    fun insertar_cuentas(cuenta: Cuenta): String{
        var i: Int = 0
        var check: Int = 0
        while (check == 0) {
            when {
                vector_cuentas[i] == null -> {
                    vector_cuentas[i] = cuenta
                    check = 1
                }
                vector_cuentas[i]!!.n_cuenta == cuenta.n_cuenta-> {
                    println("La cuenta ${cuenta.n_cuenta} ya existe para el usuario con dni: ${this.dni}.")
                    check = 1
                }
                else -> {
                    i++
                }
            }
        }
        return ""
    }
    fun moroso(): String {
        for (cuenta in vector_cuentas) {
            if (cuenta != null) {
                if (cuenta.saldo!! < 0.0) {
                       return "La persona ${this.dni} tiene cuentas en negativo.\nEl saldo de la cuenta ${cuenta.n_cuenta} es de ${cuenta.saldo}."
                }
            }
        }
        return "La persona con dni ${this.dni} no es morosa "
    }

}