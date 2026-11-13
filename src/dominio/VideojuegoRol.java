package dominio;

public class VideojuegoRol extends Videojuego {
  private int numeroMisiones ;
  public VideojuegoRol(String t, String pl, int p, int hJ, int nM, String c ){
   titulo = t;
   if(t.isEmpty()){
    System.out.println("Error título invalido.");
    }
   plataforma = pl;
   if(pl.isEmpty()){
      System.out.println("Error plataforma invalida.");
    }
   puntuacion = p;
   if(p < 0 || p > 100 ){
       System.out.println("Error puntuación invalida");
    }
   horasJugadas = hJ;
    if(hJ<= 0){
      System.out.println("Error horas jugadas invalidas");
     }
   numeroMisiones = nM;
   if(nM <= 0){
     System.out.println("Error numeros Misiones invalida.");
   }
    codigo = c ;
  }
 public int  getNumerosMisiones(){
    return numeroMisiones;
 }
 public void setNumerosMisiones(int nuevasnM){
   numeroMisiones = nuevasnM;
 }
 public String toString(){
        return "-------------\n" + "Título: " + titulo + "\n Plataforma: " + plataforma + "\n Puntuación: " + puntuacion + "\n Horas Jugadas: " + horasJugadas + "\n Numero Misiones: " + numeroMisiones + "\n -------------\n";
    }
}