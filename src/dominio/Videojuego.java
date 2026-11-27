package dominio;

import java.io.Serializable;

public class Videojuego implements Serializable{
    protected  String codigo;
    protected  String titulo;
    protected String plataforma;
    protected int puntuacion;
    protected int horasJugadas;
    public Videojuego(String titulo_, String plata_, int punt_, int horasJ, String codigo_){
        titulo = titulo_;
        if(titulo_.isEmpty()){
           System.out.println("Error título invalido.");
        }
        plataforma = plata_;
        if(plata_.isEmpty()){
          System.out.println("Error plataforma invalida.");
        }
        puntuacion = punt_;
        if(punt_ < 0 || punt_ > 100 ){
       System.out.println("Error puntuación invalida");
        }
       horasJugadas = horasJ;
       if(horasJ<= 0){
        System.out.println("Error horas jugadas invalidas");
       }
       codigo = codigo_ ;
    }
    public Videojuego(String tit){
        titulo = tit;
        if(tit.isEmpty()){
           System.out.println("Error título invalido.");
        }
        }
    
    public String getTitulo(){
        return titulo;
    }
    public String getPlataforma(){
        return plataforma;
    }
    public int getPuntuacion(){
        return puntuacion;
    }
     public int getHorasjugadas(){
        return horasJugadas;
    }
    public int setTitulo(String nuevoTitulo){
        titulo = nuevoTitulo;
        if(nuevoTitulo.isEmpty()) return -1;
        else return 0;
    }
    public void setPlataforna(String nuevaPlataforma){
        titulo = nuevaPlataforma;
    }
    public int setPuntuacion(int nuevaPuntuacion){
        puntuacion = nuevaPuntuacion;
        if(nuevaPuntuacion < 0 || nuevaPuntuacion > 100 ) return -1;
        else return 0;
    }
    public int setHorasjugadas(int nuevoHorasJugadas){
        horasJugadas = nuevoHorasJugadas;
        if(nuevoHorasJugadas <= 0) return -1;
        else return 0;
    
    }
    public String toString(){
        return "-------------\n" + "Título: " + titulo + "\n Plataforma: " + plataforma + "\n Puntuación: " + puntuacion + "\n Horas Jugadas: " + horasJugadas + "\n -------------\n";
    }
    public void mostrarFicha(){
     System.out.println(this);
    }    
   public boolean equals(Object o){
        if (this == o) return true;
        if(o instanceof Videojuego){
           Videojuego a =(Videojuego)o; return a.titulo.equals(this.titulo);
           
        }else return false;
    } 
    public int hashCode(){
      return codigo.hashCode();
    }
}   