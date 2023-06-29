
/**
 * Write a description of class EstudianteTecnico here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cliente3 extends Cliente{
    private double calificacionuno;
    private double calificaciondos;
    private double calificaciontres;
    private double calificacioncuatro;
    
    Cliente3(String identificacion, String nombre, String sede, double calificacionuno, double calificaciondos, double calificaciontres, double calificacioncuatro)throws Exception{
        super(identificacion, nombre, sede);
        setCalificacionuno(calificacionuno);
        setCalificaciondos(calificaciondos);
        setCalificaciontres(calificaciontres);
        setCalificacioncuatro(calificacioncuatro);        
    }
    
    public double calcularPromedio(){
        return (calificaciondos + calificaciondos + calificaciontres) / 3;
    }
    
    public double getCalificacionuno(){
        return calificacionuno;
    }
    public void setCalificacionuno(double calificacionuno){
        if(calificacionuno >= 0) this.calificacionuno = calificacionuno;
        else this.calificacionuno = 0;
    }
    
    public double getCalificaciondos(){
        return calificaciondos;
    }
    public void setCalificaciondos(double calificaciondos){
        if(calificaciondos >= 0) this.calificaciondos = calificaciondos;
        else this.calificaciondos = 0;
    }
    
    public double getCalificaciontres(){
        return calificaciontres;
    }
    public void setCalificaciontres(double calificaciontres){
        if(calificaciontres >= 0) this.calificaciontres = calificaciontres;
        else this.calificaciontres = 0;
    }
    
    public double getCalificacioncuatro(){
        return calificacioncuatro;
    }
    public void setCalificacioncuatro(double calificacioncuatro){
        if(calificacioncuatro >= 0) this.calificacioncuatro = calificacioncuatro;
        else this.calificacioncuatro = 0;
    }
    
}