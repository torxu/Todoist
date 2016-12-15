import java.util.ArrayList;

public class ListaTareas
{
    private ArrayList<Tarea> listaTareas;    

    public ListaTareas()
    {
        listaTareas = new ArrayList<Tarea>();
    }

    public void añadirTarea(String nuevaTarea)
    {
        Tarea tareaNuevo = new Tarea(nuevaTarea);
        listaTareas.add(tareaNuevo);
    }
    
    public void verTodasLasTareas()
    {
        int numeroTarea = 1;
        for (Tarea tarea : listaTareas){
           System.out.println(numeroTarea + ". " + tarea.getTarea() + " > " + tarea.getCompletada());
           numeroTarea++;
        }
    }
    
    public void marcarCompletada(int numeroTarea)
    {
        int numero = numeroTarea - 1;
        listaTareas.get(numero).setCompletada();
    }
}
