import java.util.*;
public class Q3 {
    public static void main (String[] args){
        int week = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the week number (1 - 7): ");
        week = sc.nextInt();
        switch (week){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("You had entered wrong number.");
        }

    }
}