
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        double A,B,C,trinagulo,circulo,trapezio,quadrado,retangulo,pi = 3.14159;

        A = scan.nextDouble();
        B = scan.nextDouble();
        C = scan.nextDouble();

        trinagulo = .5 * A * C;
        circulo = pi * C * C;
        trapezio = ((A + B) * C) / 2;
        quadrado = B * 4;
        retangulo = A * B;

        System.out.printf("TRAINGULO = %.3f\n",trinagulo);
        System.out.printf("CIRCULO = %.3f\n",circulo);
        System.out.printf("TRAPÈZIO = %.3f\n",trapezio);
        System.out.printf("QUADRADO = %.3f\n",quadrado);
        System.out.printf("RETANGULO = %.3f\n",retangulo);

        scan.close();
    }
}