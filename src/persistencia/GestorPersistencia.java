package persistencia;
import dominio.Ludoteca;
import java.io.*;
public class GestorPersistencia {
 public void guardar(Ludoteca ludoteca, String ruta){
    try(ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(ruta ))){
       os.writeObject(ludoteca);
    }
    catch(IOException e){
        System.out.println("No se ha podido guardar la ludoteca");
    }
 }
 public Ludoteca cargar(String ruta){
    try( ObjectInputStream os = new ObjectInputStream(new FileInputStream(ruta))) {
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
