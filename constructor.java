import java.util.Scanner;
public class Chair {
    Scanner read = new Scanner(System.in);
    private String name;
    private double price;
    private int rotationAllowed;
    private String material;

    Chair(){
        System.out.print("Enter name for Chair :");
        name = read.next();
        System.out.print("Enter the material used to build the chair :");
        material = read.next();
        System.out.print("Is chair able to rotate (0/1):");
        rotationAllowed = read.nextInt();
        System.out.print("Enter the price of chair :");
        price = read.nextDouble();
    }
    void display() {
        System.out.println("---------");
        System.out.println("Model Name ::" + name);
        System.out.println("Material ::" + material);
        System.out.print("Rotation ::");
        if ((rotationAllowed == 1)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        System.out.println("Price ::"+price);
        System.out.println("---------");
    }
}
