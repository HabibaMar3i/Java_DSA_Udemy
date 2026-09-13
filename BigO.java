public class BigO {
    // O(n)
    // public static void printNums(int n){
    //     for(int i = 0; i < n; i++){
    //         System.out.println(i);
    //     }
    // }

    // O(n+n) -> O(2n) remove constant so it's O(n)
    public static void printNums(int n){
        for(int i = 0; i < n; i++){
            System.out.println(i);
        }
        for(int i = 0; i < n; i++){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        // printNums(10); // O(n) gave 9 numbers printed 9 
        printNums(10); // O(n) gave 9 numbers printed same twice
    }
}