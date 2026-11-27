package persistencia;
import dominio.Ludoteca;
import java.nio.file.Path;
import java.io.*;
public class GestorPersistencia {
 public void guardar(Ludoteca ludoteca, Path ruta) throws IOException{
    try(ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("./ludoteca/ludoteca.dat"))){
       os.writeObject(ludoteca);
    }
    catch(IOException e){
        System.out.println("No se ha podido guardar la agenda");
    }
 }
 public Ludoteca cargar(Path ruta) throws IOException {
    try( ObjectInputStream os = new ObjectInputStream(new FileInputStream("./ludoteca/ludoteca.dat"))) {
        Ludoteca nueva =(Ludoteca) os.readObject();
        return nueva;
    }
    catch(FileNotFoundException e){
        System.out.println("No se ha podido abrir el fichero de datos");
        System.out.println("Se iniciará una nueva Ludoteca vacía");
      return new Ludoteca();
    }
    catch(IOException | ClassCastException e){
        System.out.println("La ludoteca no se ha podido leer");
        return new Ludoteca();
    }
    catch(ClassNotFoundException e){
       System.out.println("El objecto no es una clase ludoteca");
       return new Ludoteca();
    }
 }
}
