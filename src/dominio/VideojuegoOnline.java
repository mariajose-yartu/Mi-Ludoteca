package dominio;

public class VideojuegoOnline extends Videojuego {
    int nJOnline;
    public VideojuegoOnline(String titu, String plat, int puntu, int horaJ, int nJO, String codi ){
    titulo = titu;
   if(titu.isEmpty()){
    System.out.println("Error título invalido.");
    }
   plataforma = plat;
   if(plat.isEmpty()){
      System.out.println("Error plataforma invalida.");
    }
   puntuacion = puntu;
   if(puntu < 0 || puntu > 100 ){
       System.out.println("Error puntuación invalida");
    }
   horasJugadas = horaJ;
    if(horaJ<= 0){
      System.out.println("Error horas jugadas invalidas");
     }
   nJOnline = nJO;
   if(nJO <= 0){
     System.out.println("Error numeros Facciones invalida.");
   }
    codigo = codi ;
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