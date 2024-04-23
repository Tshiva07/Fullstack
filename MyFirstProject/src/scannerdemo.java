import java.util.Scanner;
public class scannerdemo {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter your age");
        int age=scanner.nextInt();
        System.out.println("Enter your name: ");
        String name=scanner.next();
        System.out.println("NAME: "+name);
        System.out.println("Age :"+age);
    }

}
