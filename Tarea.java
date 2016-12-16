public class Tarea
{
    private String tarea;
    private boolean completada;
    private int prioridad;
    
    public Tarea(String nuevaTarea)
    {
        tarea = nuevaTarea;
        completada = false;
        prioridad = 0;
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
        if(eligePrioridad < 0 && eligePrioridad > 5){
            prioridad = eligePrioridad;
        }
    }
}
