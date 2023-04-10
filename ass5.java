import java.util.Scanner;

abstract class shape{
double l,b;
abstract public void compute_area();
}

class rectangle extends shape
{
Scanner in=new Scanner(System.in);
public void compute_area()
{
System.out.println("Enter length and breadth");
l=in.nextDouble();
b=in.nextDouble();
System.out.println("The area of rectangle is :"+(l*b));
}
}

class triangle extends shape
{
Scanner in=new Scanner(System.in);
public void compute_area()
{
System.out.println("Enter height and base");
l=in.nextDouble();
b=in.nextDouble();
System.out.println("The area of triangle is :"+(l*b*0.5));
}
}

public class Areas {
public static void main(String[] args) {
int y;
Scanner in=new Scanner(System.in);
shape s;
rectangle r=new rectangle();
triangle t=new triangle();
do
{
System.out.println("Enter the shape whose area is to be calculated:\n1.Reactangle\n2.Triangle");
int ch=in.nextInt();
switch(ch){
case 1 : s=r;
s.compute_area();
break;
case 2 : s=t;
s.compute_area();
break;
default : System.out.println("Wrong input");
}
System.out.println("Do you wish to continue(0/1) : ");
y = in.nextInt();
}while(y==1);
}
}
