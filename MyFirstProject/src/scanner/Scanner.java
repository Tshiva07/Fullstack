package scanner;

public class Scanner {
    public static void main(String[] args) {
        java.util.Scanner scanner= new java.util.Scanner(System.in);
        System.out.println("Enter your age");
        int age=scanner.nextInt();
        System.out.println("Enter your name: ");
        String name=scanner.next();
        System.out.println("NAME: "+name);
        System.out.println("Age :"+age);
    }



}
