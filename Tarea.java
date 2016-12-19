import java.time.LocalDate;

public class Tarea
{
    private String tarea;
    private boolean completada;
    private int prioridad;
    private LocalDate fecha;
    
    public Tarea(String nuevaTarea)
    {
        tarea = nuevaTarea;
        completada = false;
        prioridad = 0;
        fecha = null;
    }
    
    public String getTarea()
    {
        return tarea;
    }
    
    public String getCompletada()
    {
        String completado = completada + "";
        if(completada == true){
            completado = "Completada";
        }
        else{
            completado = "Pendiente";
        }
        return completado;
    }
    
    public void setCompletada()
    {
        completada = true;
    }
    
    public int getPrioridad()
    {
        return prioridad;
    }
    
    public void setPrioridad(int eligePrioridad)
    {
        if(eligePrioridad >= 0 && eligePrioridad <= 5){
            prioridad = eligePrioridad;
        }
    }
    
    public void setFecha(int año, int mes, int dia)
    {
         fecha = LocalDate.of(año, mes, dia);
    }
    
    public LocalDate getFecha()
    {
        return fecha;
    }
}
