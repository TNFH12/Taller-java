package taller1_java;

/**
 *
 * @author Tania Forero
 */
public class Cuenta {
     /**
     * Representa los atributos publicos.
     */
    public int Id;
    public int IdBranch;
    public int Idbank;
      /**
     * Representa el atributo privado.
     */
    private int NumberAccount;
    /**
     * Representa get y set de los atributos id y numberaccount.
     */
    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getNumberAccount() {
        return NumberAccount;
    }

    public void setNumberAccount(int NumberAccount) {
        this.NumberAccount = NumberAccount;
    }
    
}
