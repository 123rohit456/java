import java.util.Scanner;

public class complex{

	public static void main(String[] args) {
		int ch,y;
		float n1,n2;
		Scanner in = new Scanner(System.in); 
        Complex_op cal = new Complex_op();
	
        do
        {	
		System.out.println("Enter the first number : \n");
		n1 = in.nextFloat();
		n2 = in.nextFloat();
		Complex_op o1 = new Complex_op(n1,n2);
		    
		System.out.println("Enter the second number : \n");
		n1 = in.nextFloat();
		n2 = in.nextFloat();
		Complex_op o2 = new Complex_op(n1,n2);
		
		System.out.println("1.Add\n2.Subtract\n3.Multiply\n.4.Divide");
		ch = in.nextInt();
		
		switch(ch) {
		case 1 : 
		cal.Add(o1, o2);
		break;
		
		case 2:
		cal.Sub(o1,o2);
		break;
		
		case 3 : 
		cal.Mul(o1, o2);
		break;
		
		case 4:
	    cal.Div(o1,o2);
	    break;
		}
		
		System.out.println("Do you wish to continue");
		y = in.nextInt();
		
        }while(y==1);
		 
	}
}
	class Complex_op{
		float real,imag;
		Complex_op()
		{
			real=0;
			imag=0;
		}
		Complex_op(float Comp1,float Comp2)
		{
			real=Comp1;
			imag=Comp2;
		}
		public void Add(Complex_op C1,Complex_op C2)
		{
			float real,imag;
			real = (C1.real + C2.real);
			imag = (C1.imag + C2.imag);

			System.out.println("Addition is "+real+"+"+imag+"i");
		}
		
		public void Sub(Complex_op C1,Complex_op C2)
		{
			float real,imag;
			real = (C1.real - C2.real);
			imag = (C1.imag - C2.imag);

			System.out.println("Subtraction is "+real+"+"+imag+"i");
		}
		
		public void Mul(Complex_op C1,Complex_op C2)
		{
			float real,imag;
		    real= C1.real*C2.real - C1.imag*C2.imag;
		    imag = C1.real*C2.imag + C1.imag*C2.real;
		    System.out.println("Multiplication is "+real+"+"+imag+"i");
		}
		
		public void Div(Complex_op C1,Complex_op C2)
		{
			float real,imag;
			real = (C1.real*C2.real + C1.imag*C2.imag)/((C2.real*C2.real) + (C2.imag*C2.imag));
			imag = (C1.imag*C2.real - C1.real*C2.imag)/((C2.real*C2.real) + (C2.imag*C2.imag));
			System.out.println("Division is "+real+"+"+imag+"i");
		}
	}		
		
	
	



	
	

