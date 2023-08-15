// 
// Decompiled by Procyon v0.5.36
// 

package ejerciciosenviadospooo;

public class Rectangulo
{
    private int base;
    private int altura;
    
    public Rectangulo() {
    }
    
    public Rectangulo(final int base, final int altura) {
        this.base = base;
        this.altura = altura;
    }
    
    public int getBase() {
        return this.base;
    }
    
    public void setBase(final int base) {
        this.base = base;
    }
    
    public int getAltura() {
        return this.altura;
    }
    
    public void setAltura(final int altura) {
        this.altura = altura;
    }
    
    @Override
    public String toString() {
        return "Rectangulo{base=" + this.base + ", altura=" + this.altura + '}';
    }
}
