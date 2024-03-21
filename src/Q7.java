
interface Shape7{
    void area();
}
interface ColoredShape extends Shape7{
    void color(String color);
}
class Rectangle7 implements Shape7,ColoredShape{

    private int length,width;
    public Rectangle7(int length,int width) {
        this.length=length;
        this.width=width;
    }

    @Override
    public void area() {
        int area = length * width ;
        System.out.println("the area of Rectangle is "+area);
    }

    @Override
    public void color(String color) {
        System.out.println("Color :  "+color);
    }
}
public class Q7 {
    public static void main(String[] args) {
            Rectangle7 rectangle = new Rectangle7(4,6);
            rectangle.area();
            rectangle.color("blue");
    }
}
