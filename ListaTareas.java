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
    
}
