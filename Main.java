package cuentas;
/**
 * Main
 * @author yaser
 */
public class Main {

    /**
     * Main
     * @param args Main
     */
    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );
    }
    
    /**
     * Método operativa_cuenta
     * @param cuenta cuenta
     * @param cantidad cantidad
     */
    public static void operativa_cuenta(CCuenta cuenta, float cantidad) {
        try {
            cuenta.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta.ingresar(cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}