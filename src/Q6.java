abstract class Shape6{
    abstract void area();
}
class Rectangle6 extends Shape6{
    private int  length,width;
    public Rectangle6(int length , int width) {
        this.length = length;
        this.width = width;
    }
    @Override
    void area() {
        int area = length * width ;
        System.out.println("the area of Rectangle is "+area);
    }
}
class Circle6 extends Shape6{
    private int radius;
    public Circle6(int radius) {
        this.radius=radius;
    }
    @Override
    void area() {
        final double PI = 3.14;
        double area = (double) ( PI* radius);
        System.out.println("the area of Circle is "+area);
    }
}
public class Q6 {
    public static void main(String[] args) {
        Rectangle6 rectangle = new Rectangle6(23,4);
        rectangle.area();

        Circle6 circle = new Circle6(4);
        circle.area();
    }
}
