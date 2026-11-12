package presentacion;

import dominio.Ludoteca;
import dominio.Videojuego;

public class Main {
    public static void main(String[] args) {
     Ludoteca miLudoteca = new Ludoteca();
     Videojuego juego1 = new Videojuego("Slime Rancher", "PC", 100, 85, "55");
     Videojuego juego2 = new Videojuego("Animal Crossing","Nintendo Switch", 98 , 120, "100");
     Videojuego juego3 = new Videojuego("Ghost of Yotei", "PlayStation", 99 , 40, "101");
     miLudoteca.agregar(juego1);
     miLudoteca.agregar(juego2);
     miLudoteca.agregar(juego3);
     String tituloBuscado = "Slime Rancher";
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
