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
    
    public String getCompletada()
    {
        String completado = completada + "";
        if(completada == true){
            completado = "Completado";
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
}
