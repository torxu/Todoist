public class Tarea
{
    private String tarea;
    private boolean completada;
    
    public Tarea(String nuevaTarea)
    {
        tarea = nuevaTarea;
        completada = false;
    }
    
    public String getTarea()
    {
        return tarea;
    }
    
    public boolean getCompletada()
    {
        return completada;
    }
    
    public void setCompletada()
    {
        completada = true;
    }
}
