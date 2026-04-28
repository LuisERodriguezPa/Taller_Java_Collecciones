import java.util.ArrayList;
import java.util.List;

public class ClaseArrayList {
    public static void main(String[] args) {
        List<String> listaDeTareas = new ArrayList<>();
        listaDeTareas.add("Terminar el taller de colecciones");
        listaDeTareas.add("Terminar la tarea 9");
        listaDeTareas.add("Ver el partido del Bayer");
        listaDeTareas.add("Descansar");
        listaDeTareas.add("comer");
        listaDeTareas.add("Dormirme temprano");

        System.out.println("*****Lista de Tareas*****");
        for(String tarea: listaDeTareas){
            System.out.println(tarea);
        }
        System.out.println("=========================");
        String tareaCompletada = "Ver el partido del Bayer";
        listaDeTareas.remove(tareaCompletada);
        System.out.println("Numero de total de tareas pendientes: "+listaDeTareas.size());
    }
}
