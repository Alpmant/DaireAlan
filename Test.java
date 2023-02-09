import java.io.Console;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        float pi = 3.14f;
        System.out.print("Yarıçap: ");
        double r = input.nextDouble();
        System.out.print("Merkez Açısı: ");
        double a = input.nextDouble();

        double result = (pi*(r*r)*a)/360;
        System.out.print("Alan: " + result);




























    }
}
