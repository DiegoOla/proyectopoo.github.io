import java.util.Scanner;
public class Restaurante
{
    public static void main(String[] args){
        Scanner obsc = new Scanner(System.in);
        int ventas;
        String[] ids = new String[50];
        String[] noms = new String[50];
        double[] subuno = new double[50];
        double[] subdos = new double[50];
        double[] subtres = new double[50];
        String identificacion, nombre;
        double subPostre, subComida, subBebida;
        double promedio = 0;
        
        System.out.println("Digite el número de ventas del dia: ");
        ventas = obsc.nextInt();
        
        for(int i = 0; i < ventas; i++){
            System.out.println("Escriba el número de identificación del cliente");
            identificacion = obsc.next();
            System.out.println("Escriba el nombre del cliente");
            nombre = obsc.next();
            System.out.println("1. Escriba el precio del postre: ");
            subPostre = obsc.nextDouble();
            System.out.println("2. Escriba el precio de la comida: ");
            subComida = obsc.nextDouble();
            System.out.println("3. Escriba el precio de la bebida: ");
            subBebida = obsc.nextDouble();
            
            ids[i] = identificacion;
            noms[i] = nombre;
            subuno[i] = subPostre;
            subdos[i] = subComida;
            subtres[i] = subBebida;
        }
        for(int i = 0; i < ventas; i++){
               promedio = promedio + ((subuno[i] + subdos[i] + subtres[i]) / 3) / ventas;
            }
            System.out.println("El precio de venta promedio por persona diario es: " + promedio);   
    }
}
