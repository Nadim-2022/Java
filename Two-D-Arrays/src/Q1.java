public class Q1 {
    public static int searchArray(int array[][]){
        int count = 0;
        for ( int i = 0; i < array.length; i++){
            for (int j = 0; j < array[0].length; j++){
                if (array[i][j] == 7){
                    count += 1;
                }
            }

        }
        return count;
    }
    public static void main(String [] args){
        int array[][] = {{4,7,8},{8,8,7}};

        int count = searchArray(array);
        System.out.println(count);
    }
}
