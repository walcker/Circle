package circle;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        float radius;

        var scanner = new Scanner(System.in);
        System.out.println("Entre com o raio do circulo.");
        radius = Float.parseFloat(scanner.next());

        Circle calc = new Circle();
        calc.area(radius);
        calc.circumference(radius);

        Circle calc1 = new Circle(2);

        System.out.println(calc.area(radius));
        System.out.println(calc.circumference(radius));

        System.out.println(calc1.area(radius));
        System.out.println(calc1.circumference(radius));
    }
}
