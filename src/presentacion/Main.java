package presentacion;

import java.util.ArrayList;

import dominio.Videojuego;

public class Main {
    public static void main(String[] args) {
       ArrayList <Videojuego> lista = new ArrayList<>();
    lista.add(new Videojuego("Minecraft" ,"PC" ,100 , 30));
    lista.add(new Videojuego("Silksong", "Steam", 98 , 45));
    lista.add(new Videojuego("DressMaker", "Steam" , 97 , 20));
    lista.add(new Videojuego("Kirby" , "Nintendo Switch" , 100 , 20 ));
    lista.add(new Videojuego("Slime Rancher", "Playstation", 96 , 30));
    
    }
}
