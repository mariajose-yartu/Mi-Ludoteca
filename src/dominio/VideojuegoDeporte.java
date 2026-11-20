package dominio;

public class VideojuegoDeporte extends Videojuego {
    String deporte;
    public VideojuegoDeporte(String ti, String pla, int punt, int hoJ, String d, String cod){
   super(ti, pla, punt, hoJ, cod);
   deporte = d;
   if(d.isEmpty()){
     System.out.println("Error deporte invalido.");
   }
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