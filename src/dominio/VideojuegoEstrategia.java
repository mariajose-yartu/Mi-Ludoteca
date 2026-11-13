package dominio;

public class VideojuegoEstrategia extends Videojuego {
   int nFacc;
    public VideojuegoEstrategia(String tit, String pla, int pun, int horJ, int nF, String co ){
   titulo = tit;
   if(tit.isEmpty()){
    System.out.println("Error título invalido.");
    }
   plataforma = pla;
   if(pla.isEmpty()){
      System.out.println("Error plataforma invalida.");
    }
   puntuacion = pun;
   if(pun < 0 || pun > 100 ){
       System.out.println("Error puntuación invalida");
    }
   horasJugadas = horJ;
    if(horJ<= 0){
      System.out.println("Error horas jugadas invalidas");
     }
   nFacc = nF;
   if(nF <= 0){
     System.out.println("Error numeros Facciones invalida.");
   }
    codigo = co ;
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
