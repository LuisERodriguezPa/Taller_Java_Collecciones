import java.util.HashMap;
import java.util.Map;
public class claseHashMap {
    public static Map<String, Double> directorioTrabajadores = new HashMap<>();

    public static void actualizarSalario(String nombre){
        directorioTrabajadores.replace(nombre, 30000.0);
    }
    public static void main(String[] args) {

        directorioTrabajadores.put("Pedro Paramo", 25000.0);
        directorioTrabajadores.put("Juan Perez", 30000.0);
        directorioTrabajadores.put("Luis Rodriguez", 40000.0);
        System.out.println("*** Lista de Trabajadores ***");
        directorioTrabajadores.forEach((nombre, salario)->{
            System.out.printf("Nombre: "+nombre+" Salario: "+salario);
        });
        claseHashMap.actualizarSalario("Pedro Paramo");
        System.out.println(directorioTrabajadores.get("Pedro Paramo"));
        System.out.println("**************************");
        System.out.printf("El salrio promedio es %.2f",salarioPromedio(directorioTrabajadores));
    }
    public static double salarioPromedio(Map directorio){
        double suma = 0;
        for(Object salario : directorio.values()){
            suma = suma + (double)salario;
        }
        return  suma/directorio.size();
    }



}
