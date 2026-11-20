package dominio;

public class VideojuegoRol extends Videojuego {
  private int numeroMisiones ;
  public VideojuegoRol(String t, String pl, int p, int hJ, int nM, String c ){
   super(t, pl, p, hJ, c);
   numeroMisiones = nM;
   if(nM <= 0){
     System.out.println("Error numeros Misiones invalida.");
   }
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