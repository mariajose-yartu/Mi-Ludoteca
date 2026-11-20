package dominio;

public class VideojuegoOnline extends Videojuego {
    int nJOnline;
    public VideojuegoOnline(String titu, String plat, int puntu, int horaJ, int nJO, String codi ){
    super(titu, plat, puntu, horaJ, codi);
   nJOnline = nJO;
   if(nJO <= 0){
     System.out.println("Error numeros Facciones invalida.");
   }
 }
  public int getnJO(){
    return nJOnline;
  }
  public void setNJugaOn(int nuevanJOn){
    nJOnline = nuevanJOn;
  }
 public String toString(){ 
    return "-------------\n" + "Título: " + titulo + "\n Plataforma: " + plataforma + "\n Puntuación: " + puntuacion + "\n Horas Jugadas: " + horasJugadas + "\n Número Jugadores Online: " + nJOnline + "\n -------------\n";
    }

}