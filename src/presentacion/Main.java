package presentacion;

import dominio.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ludoteca miLudoteca = new Ludoteca();
        int opcion;
        System.out.println("Bienvenido usuari@");
        do {
            System.out.println("\nOpciones");
            System.out.println("1: Añadir videojuego");
            System.out.println("2: Listar videojuegos");
            System.out.println("3: Buscar por título");
            System.out.println("4: Calcular puntuación media");
            System.out.println("5: Mejor valorado");
            System.out.println("6: Borrar");
            System.out.println("7: Filtrar por plataforma");
            System.out.println("8: Salir");
            System.out.print("¿Qué opción quieres?: ");

            while (!sc.hasNextInt()) {
                System.out.println("Introduce un número válido.");
                sc.next();
                System.out.print("¿Qué opción quieres?: ");
            }
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Título: ");
                    String titulo = sc.nextLine();
                    System.out.print("Plataforma: ");
                    String plataforma = sc.nextLine();
                    System.out.print("Puntuación (0-100): ");
                    int puntuacion = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Horas jugadas: ");
                    int horas = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Código: ");
                    String codigo = sc.nextLine();

                    miLudoteca.agregar(new Videojuego(titulo, plataforma, puntuacion, horas, codigo));
                    System.out.println("Videojuego añadido.");
                    break;

                case 2:
                    miLudoteca.listar();
                    break;

                case 3:
                    System.out.print("Título a buscar: ");
                    titulo = sc.nextLine();
                    String encontrado = miLudoteca.buscarPorTitulo(titulo);
                    System.out.println(encontrado != null ? encontrado : "No se encontró el videojuego.");
                    break;

                case 4:
                    System.out.println("Puntuación media: " + miLudoteca.calcularPuntuacionMedia());
                    break;

                case 5:
                    Videojuego mejor = miLudoteca.mejorValorado();
                    System.out.println(mejor != null ? mejor : "No hay videojuegos.");
                    break;

                case 6:
                    System.out.print("Título a borrar: ");
                    titulo = sc.nextLine();
                    miLudoteca.borrar(titulo);
                    System.out.println("Operación completada.");
                    break;

                case 7:
                    System.out.print("Plataforma a filtrar: ");
                    plataforma = sc.nextLine();
                    String filtrados = miLudoteca.filtarporPlataforma(plataforma);
                    System.out.println(filtrados != null ? filtrados : "No hay videojuegos para esa plataforma.");
                    break;

                case 8:
                    System.out.println("¡Hasta pronto!");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 8);

        sc.close();
    }
}