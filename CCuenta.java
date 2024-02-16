package cuentas;
/**
 * CCuenta
 * @author yaser
 */
public class CCuenta {

    
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    
    public CCuenta() {
        
    }

    /**
     * CCuenta
     * @param nom nombre
     * @param cue cuenta
     * @param sal saldo
     * @param tipo tipo de interes
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * Muestra el saldo de la cuenta
     * @return saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Establece el saldo de la cuenta
     * @param saldo saldo
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Establece el nombre de la cuenta
     * @param nombre nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Obtiene la cuenta
     * @return cuenta
     */
    public String getCuenta() {
        return cuenta;
    }
    
    /**
     * Establece la cuenta
     * @param cuenta cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }
    
    /**
     * Establece el tipo de interés
     * @param tipoInteres tipo de interes
     */
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }
    
    /**
     * 
     * @param cantidad
     * @throws Exception saldo
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception ("No se puede ingresar una cantidad negativa");
        }
        saldo = saldo + cantidad;
    }

    /**
     * 
     * @param cantidad
     * @throws Exception cantidad
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (getSaldo() < cantidad) {
            throw new Exception("No hay suficiente saldo");
        }
        saldo = saldo - cantidad;
    }

    /**
     * estado de la cuenta
     * @return saldo
     */
    public double estado() {
        return saldo;
    }
}