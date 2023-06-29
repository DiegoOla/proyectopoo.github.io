
/**
 * Write a description of class Estudiante here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Cliente{
    protected final String identificacion;
    private String nombre;
    private String sede;
    
    public Cliente(String identificacion, String nombre, String sede)throws Exception{
        if(identificacion.trim().equals(""))
            throw new Exception("valor invalido en la identificacion");
        
        if(identificacion.matches(".*[a-zA-Z].*"))
            throw new Exception("La identificacion no puede tener caracteres");
        
        this.identificacion = identificacion;
        setNombre(nombre);
        setSede(sede);
        
    }
    
    public abstract double calcularPromedio();
    
    public String getIdentificacion(){
        return identificacion;
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        if(nombre != null) this.nombre = nombre;
        else this.nombre = "";
    }
    
    public String getSede(){
        return sede;
    }
    public void setSede(String sede){
        if(sede != null) this.sede = sede;
        else this.sede = "";
    }
    
}
