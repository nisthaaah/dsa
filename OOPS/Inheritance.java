package oops;

    class Shape{ //base class
        public void area(){
            System.out.println("Displays area");
        }
    }
    
    class Triangle extends Shape{ //sub class
        public void area(int l, int h){ //single level
            System.out.println("The area of the triangle is: " +0.5 * l * h);
        }                     
    }
    
    class EquilateralTriangle extends Triangle{
        public void area(int l, int h){ //multi level
            System.out.println("The area of the equilateral triangle is: " +0.5 * l * h); 
        }
    }

    class Circle extends Shape{
        public void area(int r){ //hierarchial level
            System.out.println("The area of the circle is: " +(3.14) * r * r);
        }
    }


public class Inheritance {
    public static void main(String[] args){
        Shape s = new Shape();
        s.area();

        Triangle t = new Triangle();
        t.area(4, 2);

        Circle c = new Circle();
        c.area(4);
    }
}