package dominio;

public class VideojuegoEstrategia extends Videojuego {
   int nFacc;
    public VideojuegoEstrategia(String tit, String pla, int pun, int horJ, int nF, String co ){
   super(tit, pla, pun, horJ, co);
   nFacc = nF;
   if(nF <= 0){
     System.out.println("Error numeros Facciones invalida.");
   }
  }
  public int getnFacc(){
    return nFacc;
  }
  public void setNfacciones(int nuevanF){
    nFacc = nuevanF;
  }
  public String toString(){
        return "-------------\n" + "Título: " + titulo + "\n Plataforma: " + plataforma + "\n Puntuación: " + puntuacion + "\n Horas Jugadas: " + horasJugadas + "\n Números facciones: " + nFacc + "\n -------------\n";
    }
}
