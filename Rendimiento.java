import java.util.Scanner;
public class Rendimiento{
    public static Scanner sc = new Scanner(System.in);

    public static final double NOTA_MINIMA = 3.0; 
    public static int numeroEstudiantes = 0;
    public static double[] notasFinales;
    

    public static void main(String args[]){
        System.out.println("ingresa el numero de estudiantes: ");
        numeroEstudiantes = sc.nextInt();
        notasFinales = new double[numeroEstudiantes];
        
        for(int i = 0; i < numeroEstudiantes; i++){

                System.out.println("ingresa la nota final de cada uno de tus estudiantes: ");
                notasFinales[i] = sc.nextDouble();
        }
        
    }

}