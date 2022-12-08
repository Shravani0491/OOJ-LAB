import java.lang.Math;
abstract class Shape
{
 int a,b;
 double area;
 Shape(int x,int y)
 {
  a=x;
  b=y;
  area=0;
 }
 abstract void printArea();
}

class Rectangle extends Shape
{
 Rectangle(int x,int y)
 {
  super(x,y);
 }
 void printArea()
 {
  area=a*b;
  System.out.println("Rectangle area="+" "+area);
 }
}

class Triangle extends Shape
{
 Triangle(int x,int y)
 {
  super(x,y);
 }
 void printArea()
 {
  area=(a*b*0.5);
  System.out.println("Triangle area"+" "+area);
 }
}

class Circle extends Shape
{
 Circle(int x)
 {
  super(x,-1);
 }
 void printArea()
 {
  area=3.142*Math.pow(a,2);
  System.out.println("Circle area"+" "+area);
 }
}

class DemoShape
{
 public static void main(String args[])
 {
  Rectangle r=new Rectangle(10,20);
  Triangle t=new Triangle(5,20);
  Circle c=new Circle(10);
  Shape s;
  s=r;
  s.printArea();
  s=t;
  s.printArea();
  s=c;
  s.printArea();
 }
}
  