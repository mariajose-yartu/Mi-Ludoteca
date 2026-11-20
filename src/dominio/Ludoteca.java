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
    public void listar(){
     for (Videojuego v : ludoteca1){
       System.out.println(v.toString());
     }
    }
    public String buscarPorTitulo(String titulo){
     for(Videojuego videojuego : ludoteca1){
        if(videojuego.getTitulo().equals(titulo)){
            return videojuego + "\n";
        }
     }
     return null;
    }
    
   public double calcularPuntuacionMedia(){
      if(ludoteca1.isEmpty()){
        return 0.0;
      }
      double total = 0.0;
      for(Videojuego videojuego: ludoteca1){
        total += videojuego.getPuntuacion();
      }
      return total/ludoteca1.size();
    }
    public Videojuego mejorValorado(){
     if(ludoteca1.isEmpty()){
        return null;
     }
      Videojuego mejor = ludoteca1.get(0);
      for(Videojuego videojuego : ludoteca1){
        if(videojuego.getPuntuacion() > mejor.getPuntuacion()){
          mejor = videojuego;
        }
      }
      return mejor;
    }
    public void borrar(String titulo){
        ludoteca1.remove(new Videojuego(titulo));
    }
    public String filtarporPlataforma(String plataforma){
     for(Videojuego videojuego: ludoteca1){
       if(videojuego.getPlataforma().equals(plataforma)){
        return videojuego + "\n";
       }
     }
     return null;
    }
}