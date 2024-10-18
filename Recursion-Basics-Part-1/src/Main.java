// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void PrintNumberInDecreasingOrder (int n){
        if(n == 1){
          System.out.println(n);
          return;
        }
        System.out.print(n+" ");
        PrintNumberInDecreasingOrder(n-1);
    }
    public static void PrintNumberInIncreasingOrder (int n){
        if(n == 1){
            System.out.print(n+" ");
            return;
        }
        PrintNumberInIncreasingOrder(n-1);
        System.out.print(n+" ");

    }

    public static int FindFactorialOfN(int n){
        if(n == 0){
            return 1;
        }
        //int fnm1 = FindFactorialOfN(n-1);
        int fn = n * FindFactorialOfN(n-1);
        return fn;
    }
    public static int SumNnaturalNum(int n){
        if(n == 1){
            return 1;
        }
        int sum1 = SumNnaturalNum(n-1);
        int sum = n + sum1;
        return sum;
    }
    public static int FibonacciNum(int n){
        if (n == 0 || n == 1){
            return n;
        }
        int fmn1 = FibonacciNum(n -1);
        int fmn2 = FibonacciNum(n-2);
        int fmn = fmn1 + fmn2;
        return fmn;
    }
    public static boolean isSorted(int[] arr, int i){
        if(i == arr.length-1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }
    public static int FirstOccurrence(int[] arr, int key, int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return FirstOccurrence(arr, key, i+1);
    }
    public static int LastOccurrence(int[] arr, int key, int i){
        if(i == arr.length){
            return -1;
        }
        int isFound = LastOccurrence(arr, key, i+1);
        if(isFound == -1 && arr[i] == key){
            return i;
        }
        return isFound;
    }
    public static int powerofN(int x, int n){
        if(n == 0){
            return 1;
        }

        return x * powerofN(x, n -1);
    }
    public static int OPpowerofN(int x, int n){
        if(n == 0){
            return 1;
        }
        int halfPower = OPpowerofN(x, n/2);
        int halfPowerSq =  halfPower * halfPower;

        if (n % 2 != 0){
            halfPowerSq = x * halfPowerSq;
        }

        return halfPowerSq;
    }
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {1, 2, 3, 5, 4, 5};
        PrintNumberInDecreasingOrder(n);
        PrintNumberInIncreasingOrder(n);
        System.out.println(FindFactorialOfN(n));
        System.out.println(SumNnaturalNum(n));
        System.out.println(FibonacciNum(n));
        System.out.println(isSorted(arr, 0));
        System.out.println(FirstOccurrence(arr, 5, 0));
        System.out.println(LastOccurrence(arr, 5, 0));
        System.out.println(powerofN(2, 2));
        System.out.println(OPpowerofN(2,3));
    }
}