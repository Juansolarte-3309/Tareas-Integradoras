import java.util.Scanner;

public class Rendimiento{
    public static  Scanner sc = new Scanner(System.in);

    public static double[] notasFinales;

    public final int NOTA_MINIMA = 0;


    public static void main(String[] args) {
        
        System.out.println("ingrese el numero de estudiantes: ");
        int estudiantes = sc.nextInt();


        notasFinales = new double[estudiantes];

        for(int i = 0; i < estudiantes; i++){

            System.out.println("ingrese la nota final de cada uno de los estudianes: ");
            

        }


    }
}