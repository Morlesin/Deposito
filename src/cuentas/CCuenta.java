package cuentas;

/**
 * Esta clase crea objetos Cuenta Bancaria para poder operar con ellos
 * @author Entornos de Desarollo
 * @version 1.00
 * @since version 1
 */
public class CCuenta {

    /**
     * cadena Nombre del propietario de la cuenta
     */
    private String nombre;
    /**
     * cadena  con IBAN de la cuenta o numero de centa corriente 
     */
    private String cuenta;
    /**
     * numero real con saldo de la cuenta
     */
    private double saldo;
    /**
     * numero real con tipo de interes
     */
    private double tipoInterés;

    /**
     * Este no recibe parametros,y devuelve el valos de el atributo nombre
     * @return String nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Este metodo modifica el atributo nombre con el paremetro recivido nombre qu sea una cadena
     * no devuelve nada
     * @param nombre cadena recibida para cambiar parametro nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * @param tipoInterés the tipoInterés to set
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
/**
 * Constructor por defecto,
 *  crea una nueva instancia de la clase CCuenta
 */
    public CCuenta()
    {
    }
/**
 * Constructor  con parametros,
 *  crea una nueva instancia de la clase CCuenta con los paarametros especificados
 * @param nom cadena nombre cliente
 * @param cue cadena IBAN
 * @param sal double saldo
 * @param tipo double  tipo de interes
 */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
/**
 * Este metodo develve el resultado de la llamada metodo getSaldo
 * @return double resultado de llamada a getSaldo (saldo numero real)
 */
    public double estado()
    {
        return getSaldo();
    }
/**
 * Este metodo recibe como paramtro una cantidad para ingresar, si la cantidad es mayor que cero envia al
 *  metodo setSaldo el paramtro que resulte de la suma de getsaldo (saldo actual) mas la cantidad a ingresar 
 *  actualizando el parametro saldo.
 *  Si la cantidad es inferior a cero lanzara una excepcion
 * @param cantidad double numero real con cantidad a ingresar-/M 
 * @throws Exception  No se puede ingresar una cantidad negativa
 */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
/**
 * Este metodo recibe como parametro una cantidad a retirar, si la cantidad es igual o menor que cero, 
 *  se lanzara una excepcion. Si la cantidad a retirar  es mayor que el saldo (preguntando al metodo estado) 
 *  lanzara una excepcion y si no se cumlen ninguna de las anteriores envia al
 *  metodo setSaldo el paramtro que resulte de la resta de getsaldo (saldo actual) menos la cantidad a retirar 
 *  actualizando el parametro saldo.
 * @param cantidad double cantidad a retirar
 * @throws Exception "No se puede retirar una cantidad negativa" o "No se hay suficiente saldo"
 */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}