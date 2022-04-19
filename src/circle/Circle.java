package circle;

public class Circle {

    private float radius;

    public Circle() {

    }

    Circle(float radius){
        this.radius = radius;
    }

    public double area(float radius) {
        return Math.PI * this.radius * this.radius;
    }

    public double circumference(float radius) {
        return Math.PI * this.radius *2;
    }
    public void main(String[] args) {
        Circle c = new Circle();
        System.out.println("Area do circulo: " + c.area(radius));
        System.out.println("Circumferencia do circulo: " + c.circumference(radius));
    }
}
