abstract class Shape
{
  abstract double calculateArea();
}
  class Rectangle extends Shape
  {
   private double length;
   private double width;
   public Rectangle(double length, double width)
   {
     this.length = length;
     this.width = width;
   }
    double calculateArea()
    {
     return length * width;
     }
  }
    class Circle extends Shape
     {
       private double radius;
       public Circle(double radius)
       {
        this.radius = radius;
       }
        double calculateArea()
         {
           return Math.PI * radius * radius;
          }
        }
          class Triangle extends Shape
           {
             private double base;
             private double height;
             public Triangle(double base, double height)
             {
               this.base = base;
               this.height = height;
             }
              double calculateArea()
              {
                return 0.5 * base * height;
               }
              }
                public class Main
                 {
                   public static void main(String args[])
                    {
                      Shape rectangle = new Rectangle(10, 5);
                      Shape circle = new Circle(7);
                      Shape triangle = new Triangle(8, 6);
                      System.out.println("Area of Rectangle: " + rectangle.calculateArea());
                      System.out.println("Area of Circle: " + circle.calculateArea());
                      System.out.println("Area of Triangle: " + triangle.calculateArea());
                    }
               }