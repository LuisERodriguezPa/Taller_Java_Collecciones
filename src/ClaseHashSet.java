import java.util.HashSet;
import java.util.Set;
public class ClaseHashSet {
    public static void main(String[] args) {
        Set<String> coleccionDeLibros = new HashSet<>();
        coleccionDeLibros.add("Cien Años de Soledad");
        coleccionDeLibros.add("Las arenas del alma");
        coleccionDeLibros.add("Destinados al exito");
        coleccionDeLibros.add("La culpa es de la vaca");
        coleccionDeLibros.add("la odisea");
        coleccionDeLibros.add("Doce Cuentos Peregrinos");

        System.out.println("**** Lista de Libros *****");
        for (String libro:coleccionDeLibros){
            System.out.println(libro);
        }
        System.out.println("================================");
        String libro = "Los funerales de mama grande";
        if(coleccionDeLibros.contains(libro)){
            System.out.println("El libro si esta en Disponible");
        }else{
            System.out.println("El libro no esta Disponible");
        }
        System.out.println("===================");
        System.out.println("Hay "+coleccionDeLibros.size()+" Libros en la Biblioteca");
    }
}
