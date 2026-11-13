package presentacion;

import dominio.*;

public class Main {
    public static void main(String[] args) {
     Ludoteca miLudoteca = new Ludoteca();
     Videojuego juego1 = new VideojuegoRol("Monster Hunter: World", "PlayStation", 100, 100, 85, "55");
     Videojuego juego2 = new VideojuegoOnline("Minecraft","PC", 98 , 120,200, "100");
     Videojuego juego3 = new VideojuegoDeporte("Mario Tennis", "Nintendo Switch", 99 , 40,"tenis", "101");
     Videojuego juego4 = new VideojuegoEstrategia("Warhammer", "Físico", 99 , 40,50, "101");
     miLudoteca.agregar(juego1);
     miLudoteca.agregar(juego2);
     miLudoteca.agregar(juego3);
    miLudoteca.agregar(juego4);    
     String tituloBuscado = "Minecraft";
     String resultadoBusqueda = miLudoteca.buscarPorTitulo(tituloBuscado);
     if(resultadoBusqueda != null){
        System.out.println("videojuego encontrado: " + resultadoBusqueda);
     }else{
        System.out.println("Videojuego no encontrado.");
     }
     System.out.println("Ludoteca:");
     System.out.println(miLudoteca.toString());
    }
}
