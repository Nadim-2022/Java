import java.util.Scanner;

public class Q1 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        float average = (float) (A+B+C)/3;

        System.out.println(average);

    }
}
