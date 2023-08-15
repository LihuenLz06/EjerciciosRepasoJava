
package PracticaJuegoRelaciones;


public class VideoJuegoEntidades {
    
    private int codigo;
    private String titulo;
    private String tipoConsola;
    private int cantJugadores;
    private String categoria;

    public VideoJuegoEntidades() {
    }

    public VideoJuegoEntidades(int codigo, String titulo, String tipoConsola, int cantJugadores, String categoria) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.tipoConsola = tipoConsola;
        this.cantJugadores = cantJugadores;
        this.categoria = categoria;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTipoConsola() {
        return tipoConsola;
    }

    public void setTipoConsola(String tipoConsola) {
        this.tipoConsola = tipoConsola;
    }

    public int getCantJugadores() {
        return cantJugadores;
    }

    public void setCantJugadores(int cantJugadores) {
        this.cantJugadores = cantJugadores;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "VideoJuegoEntidades{" + "codigo=" + codigo + ", titulo=" + titulo + ", tipoConsola=" + tipoConsola + ", cantJugadores=" + cantJugadores + ", categoria=" + categoria + '}';
    }
    
    
    
}
