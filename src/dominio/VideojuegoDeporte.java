package dominio;

public class VideojuegoDeporte extends Videojuego {
    String deporte;
    public VideojuegoDeporte(String ti, String pla, int punt, int hoJ, String d, String cod){
   titulo = ti;
   if(ti.isEmpty()){
    System.out.println("Error título invalido.");
    }
   plataforma = pla;
   if(pla.isEmpty()){
      System.out.println("Error plataforma invalida.");
    }
   puntuacion = punt;
   if(punt < 0 || punt > 100 ){
       System.out.println("Error puntuación invalida");
    }
   horasJugadas = hoJ;
    if(hoJ<= 0){
      System.out.println("Error horas jugadas invalidas");
     }
   deporte = d;
   if(d.isEmpty()){
     System.out.println("Error deporte invalido.");
   }
    codigo = cod ;
  }
  public String getDeporte(){
    return deporte;
  }
  public void setDeporte(String nuevoDeporte){
   deporte = nuevoDeporte;
  }
   public String toString(){
        return "-------------\n" + "Título: " + titulo + "\n Plataforma: " + plataforma + "\n Puntuación: " + puntuacion + "\n Horas Jugadas: " + horasJugadas + "\n Deporte: " + deporte + "\n -------------\n";
    }
}