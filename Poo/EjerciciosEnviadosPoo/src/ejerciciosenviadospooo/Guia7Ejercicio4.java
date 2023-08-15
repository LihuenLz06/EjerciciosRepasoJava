// 
// Decompiled by Procyon v0.5.36
// 

package ejerciciosenviadospooo;

import ejerciciosenviadospooo.Rectangulo;
import ejerciciosenviadospooo.ServicioRectangulo;

public class Guia7Ejercicio4
{
    public static void main(final String[] args) {
        final ServicioRectangulo sr = new ServicioRectangulo();
        final Rectangulo r1 = sr.crearRectangulo();
        sr.perimetroRectangulo(r1);
        sr.superficieRectangulo(r1);
        sr.dibujoRectangulo(r1);
    }
}
