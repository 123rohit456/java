import java.util.Scanner;

class Parentt{
	void print() {
		System.out.println("Parent class");
	}
}

class Child extends Parent{
	void print() {
		System.out.println("Child class");
	}
}

public class Parent{
    public static void main(String args[]) {
	Parentt p = new Parentt();
	Child c = new Child();
	Scanner in = new Scanner(System.in);
	int ch,y;
	
	do {
		System.out.println("Enter choice :1.Parent 2.Child\n");
		ch = in.nextInt();
		switch(ch) {
		case 1 : p.print();
		break;
		case 2 : c.print();
		break;
		default : System.out.println("Nothing selected");
		}
		System.out.println("Do you wish to continue : ");
		y = in.nextInt();
	}while(y==1);
}
}
