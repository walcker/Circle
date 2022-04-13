package circle;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        float radius;

        var scanner = new Scanner(System.in);
        System.out.println("Entre com o raio do circulo.");
        float input = Float.parseFloat(scanner.next());
        radius = input;

        Circle calc = new Circle(radius);
        calc.calcular();
    }
}
