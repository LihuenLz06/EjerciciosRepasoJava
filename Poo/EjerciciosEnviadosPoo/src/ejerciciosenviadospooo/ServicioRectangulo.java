// 
// Decompiled by Procyon v0.5.36
// 

package ejerciciosenviadospooo;

import ejerciciosenviadospooo.Rectangulo;
import java.util.Scanner;

public class ServicioRectangulo
{
    Scanner leer;
    
    public ServicioRectangulo() {
        this.leer = new Scanner(System.in);
    }
    
    public Rectangulo crearRectangulo() {
        final Rectangulo r1 = new Rectangulo();
        System.out.println("Ingrese la base en m");
        r1.setBase(this.leer.nextInt());
        System.out.println("Ahora ingrese la altura por favor");
        r1.setAltura(this.leer.nextInt());
        return r1;
    }
    
    public void superficieRectangulo(final Rectangulo r1) {
        final int superficie = r1.getBase() * r1.getAltura();
        System.out.println("La superficie de su rect\u00e1ngulo es de: " + superficie);
    }
    
    public void perimetroRectangulo(final Rectangulo r1) {
        final int perimetro = (r1.getBase() + r1.getAltura()) * 2;
        System.out.println("El per\u00edmetro de su rect\u00e1ngulo es de: " + perimetro);
    }
    
    public void dibujoRectangulo(final Rectangulo r1) {
        final int base = r1.getBase();
        final int altura = r1.getAltura();
        for (int i = 1; i < base; ++i) {
            System.out.print("*");
        }
        System.out.println("*");
        for (int j = 1; j < altura - 1; ++j) {
            System.out.print("*");
            for (int k = 1; k <= base - 2; ++k) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for (int l = 1; l < base; ++l) {
            System.out.print("*");
        }
        System.out.println("*");
        System.out.println("Muchas gracias por usar nuestro programa!");
    }
}
