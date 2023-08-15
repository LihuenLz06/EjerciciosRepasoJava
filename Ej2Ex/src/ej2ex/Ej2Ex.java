
package ej2ex;

public class Ej2Ex {

    public static void main(String[] args) {
        
       Integer array[] = new Integer[3];
        
        try {
        for (int i = 0; i < 4; i++) {
            array[i]=4;
        }    
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        
    }
    
}
