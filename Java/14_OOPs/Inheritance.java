
    class Shape{
        public void area(){
            System.out.println("displays area");
        }
    }
    class Triangle extends Shape {
        public void area ( int l , int h){
            System.out.println(1/2*l*h);
        }
    }
   class Circle extends Shape{
    public void area(int r){
        System.out.println((3.14)*r*r);
    }
   }
   public class Inheritance {
    public static void main(String[] args) {
        // Create a Shape object
        Shape s = new Shape();
        s.area(); // displays area

        // Create a Triangle object
        Triangle t = new Triangle();
        t.area(); // inherited method from Shape
        t.area(10, 5); // overridden method in Triangle

        // Create a Circle object
        Circle c = new Circle();
        c.area(); // inherited method from Shape
        c.area(7); // overridden method in Circle
    }
}
