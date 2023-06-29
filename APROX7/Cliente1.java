
/**
 * Write a description of class EstudianteJardin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cliente1 extends Cliente{
    private double calificacionuno;
    private double calificaciondos;
    
    Cliente1(String identificacion, String nombre, String sede, double calificacionuno, double calificaciondos)throws Exception{
        super(identificacion, nombre, sede);
        setCalificacionuno(calificacionuno);
        setCalificaciondos(calificaciondos);
    }

    public double calcularPromedio(){
        return (calificacionuno + calificaciondos) / 2;
    }
    
    public double getCalificacionuno(){
        return calificacionuno;
    }
    public void setCalificacionuno(double Calificacionuno){
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
    
}
