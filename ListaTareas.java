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
        if(numero >=0 && numero < listaTareas.size()){
            listaTareas.get(numero).setCompletada();
        }
    }
    
    public void mostrarCoincidencias(String buscar)
    {
        int posicion = 0;
        while (posicion < listaTareas.size()){
            Tarea tareaActual = listaTareas.get(posicion);
            if (tareaActual.getTarea().contains(buscar)){
                System.out.println((posicion + 1) + ". " + tareaActual.getTarea() + " > " + tareaActual.getCompletada());
            }
            posicion++;
        }
    }
    
    public void eliminarTarea(int tareaAEliminar)
    {
        int numeroTarea = tareaAEliminar - 1;
        if(numeroTarea >= 0 && numeroTarea < listaTareas.size()){
            listaTareas.remove(numeroTarea);
        }
    }
    
    public void definirPrioridad(int prioridad)
    {
        int numero = prioridad;
        listaTareas.setPrioridad(prioridad);
    }
}
