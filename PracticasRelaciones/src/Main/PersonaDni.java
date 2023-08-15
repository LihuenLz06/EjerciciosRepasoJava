
package Main;

public class PersonaDni {
    private int numero;
    private char letra;

    public PersonaDni() {
    }

    public PersonaDni(int numero, char letra) {
        this.numero = numero;
        this.letra = letra;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    @Override
    public String toString() {
        return "PersonaDni{" + "numero=" + numero + ", letra=" + letra + '}';
    }

   
    
}
