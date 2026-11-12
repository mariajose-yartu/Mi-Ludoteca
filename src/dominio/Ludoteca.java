package dominio;

import java.util.ArrayList;

public class Ludoteca {
    private ArrayList<Videojuego> ludoteca1 = new ArrayList<>();
    public Ludoteca(ArrayList<Videojuego> ludoteca_) {
        ludoteca1 = ludoteca_;
    }
    public Ludoteca(){}
    public Ludoteca agregar(Videojuego videojuego) {
        ludoteca1.add(videojuego);
        return this;
    }
    public String toString(){
     String resultado = "";
     for (Videojuego videojuego : ludoteca1){
        resultado += videojuego + "\n";
     }
     return resultado;
    }
    public String buscarPorTitulo(String titulo){
     for(Videojuego videojuego : ludoteca1){
        if(videojuego.getTitulo().equals(titulo)){
            return videojuego + "\n";
        }
     }
     return null;
    }
    }

