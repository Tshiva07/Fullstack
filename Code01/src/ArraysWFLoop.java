import java.util.Scanner;
public class ArraysWFLoop {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the sixe of the Array");
        int size = sc.nextInt();
        int[] numbers = new int[size];
        for (int i=0; i<size; i++){
            System.out.println("Please enter the number at index:"+i);
            numbers [i]=sc.nextInt();
        }
        for (int i=0; i<size; i++){
            System.out.println("The element at index:"+i+"is:"+numbers[i]);

        }
    }
}
