/*
 * JavaBean Pelicula
 */
package cinedaw;

import java.io.Serializable;

/**
 *
 * @author mfontana
 */
public class Pelicula implements Serializable {
    
    private String titulo;
    private String director;
    private int duracion;
    private String genero;
    private int valoracion;
    private boolean visto;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, int duracion, String genero, int valoracion, boolean visto) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
        this.genero = genero;
        this.valoracion = valoracion;
        this.visto = visto;
    }
    

    public boolean isVisto() {
        return visto;
    }

    public void setVisto(boolean visto) {
        this.visto = visto;
    }


    public int getValoracion() {
        return valoracion;
    }

    public void setValoracion(int valoracion) {
        this.valoracion = valoracion;
    }


    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }


    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }


    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

}
