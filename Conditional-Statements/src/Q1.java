import java.util.*;
public class Q1 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number > 0){
            System.out.println(number + " is a positive number.");
        }
        else{
            System.out.println(number + " is a negative number.");
        }
    }
}
