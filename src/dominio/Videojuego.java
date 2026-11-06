package dominio;

public class Videojuego {
    private String titulo;
    private String plataforma;
    private int puntuacion;
    private int horasJugadas;

    public Videojuego(String titulo_,  String plataforma_ , int puntuacion_ , int horasJugadas_ ){
        titulo = titulo_ ;
        if(titulo_.isEmpty()){
           System.out.println("Error título invalido");
        }
        plataforma = plataforma_;
        puntuacion = puntuacion_;
        if(puntuacion_ < 0 || puntuacion_ > 100 ){
            System.out.println("Error puntuación invalida");
        }
        horasJugadas = horasJugadas_;
        if(horasJugadas_<= 0){
           System.out.println("Error horas jugadas invalidas");
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
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (!(obj instanceof Videojuego)) return false;
        Videojuego otro = (Videojuego) obj;
        return puntuacion == otro.puntuacion
                && horasJugadas == otro.horasJugadas
                && java.util.Objects.equals(titulo, otro.titulo)
                && java.util.Objects.equals(plataforma, otro.plataforma);
    }
}