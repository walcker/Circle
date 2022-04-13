package circle;

public class Circle {
    float perimetro;
    float area;
    float radius;

    Circle(float radius){
        this.radius = radius;
    }

    public void calcular(){
        perimetro = (float) (2 * Math.PI * radius);
        area = (float) (Math.PI*Math.pow(radius,2));

        System.out.println(perimetro);
        System.out.println(area);
    }
}
