import java.util.*;

public class Q3 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();

        float total = pencil + pen + eraser;

        float Total_after_gst = (float) (total * 1.18);

        System.out.println("Total cost without gst: "+Total_after_gst + "With 18% gst: "+ total);
    }
}
