public class BigO {
    public static void printNums(int n){
        for(int i = 0; i < n; i++){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        printNums(10); // O(n) gave 9 numbers printed 9 

    }
}