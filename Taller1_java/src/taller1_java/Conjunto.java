package taller1_java;
/**
 *
 * @author Tania Forero
 */
public class Conjunto {
    /**
     * Representa los atributos publicos.
     */
    public int block;
    public int inside;
    public int apartment;
      /**
     * Representa el atributo privado.
     */
    private String Nameowner;
     /**
     * Representa get y set del atributo para Nameowner.
     */
    public String getNameowner() {
        return Nameowner;
    }

    public void setNameowner(String Nameowner) {
        this.Nameowner = Nameowner;
    }
   
}
