package taller1_java;

/**
 *
 * @author Tania Forero
 */
public class CuentaBancaria {
      /**
     * Representa el atributo privado.
     */
    private int accountNumber;
     /**
     * Representa el atributo protegido.
     */
    protected boolean activated;
    /**
     * Representa get y set del atributo activated.
     */
    public boolean isActivated() {
        return activated;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }
   
}
