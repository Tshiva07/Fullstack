/*import java.util.Scanner;

//if statement
public class conditionalsstatements{
    public static void main(String[] args) {
        int i =10;
        if(i>=5)
            System.out.println(i+"is the greater then 5");
    }
}*/

/*if else statement*/
/*___________________________________________________________________________________
import java.util.Scanner;
public class conditionalsstatements {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n = sc.nextInt();
    if (n>0){
        System.out.println("Enter the value of n:");

    }
    else {
        System.out.println("The number is +ve.");

    }
    }
}*/
//______________________________________________________________________________________

//else if
import java.util.Scanner;
public class conditionalsstatements{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your score ");
        int score = sc.nextInt();
        if (score >= 75) {
            System.out.println("Grade A");
        } else if (score >= 65 && score < 75) {
            System.out.println("Grade B");
        } else if (score >= 55 && score < 65) {
            System.out.println("Grade C");
        } else {
            System.out.println("Grade D");
        }
    }
}