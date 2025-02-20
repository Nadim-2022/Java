// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    // Tiling Problem
    public static int tiling(int n){ // 2 x n
        if(n == 0 || n == 1){
            return 1;
        }
        int fnm1 = tiling(n-1);
        int fnm2 = tiling(n-2);
        int totalways = fnm1 + fnm2;

        return totalways;
    }
    public static void rmduplicate(String str, int idx, StringBuilder newString, boolean[] map){
        if (idx == str.length()){
            System.out.println(newString);
            return;
        }
        char currentChar = str.charAt(idx);
        if(map[currentChar - 'a']){
            rmduplicate(str, idx+1, newString, map);
        }else{
            map[currentChar - 'a'] = true;
            rmduplicate(str, idx+1, newString.append(currentChar), map);
        }
    }
    public static int friendsParing(int n){
        if(n == 1 || n == 2){
            return n;
        }
        int fnm1 = friendsParing(n -1);
        int fnm2 = friendsParing(n-2);
        int pairWays = (n-1) * fnm2;

        int totalWays = fnm1 + pairWays;
        return totalWays;
    }

    public static void printBinString(int n, int lastPlace, String str){
        if (n == 0){
            System.out.println(str);
            return;
        }
        printBinString(n-1, 0, str+"0");
        if(lastPlace == 0){
            printBinString(n-1, 1, str+"1");
        }
    }

    public static void numberToString(int n){

    }
    public static void findIndices(int[] array, int key, int n){
        if(n == array.length){
            return;
        }

        if(array[n] == key){
            System.out.print(n+" ");
        }

        findIndices(array, key, n+1);

    }
    public static void main(String[] args) {
        //System.out.println(tiling(2));
        //String str = "nnaadiimm";
        //rmduplicate(str, 0, new StringBuilder(), new boolean[26]);
        //System.out.println(friendsParing(3));
        //printBinString(3, 0, "");
        int array[] = {2,5,8,2,4,7,2,8,3,2};
        findIndices(array, 2, 0);
    }

}