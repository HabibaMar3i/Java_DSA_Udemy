public class BigO {
    // O(n)
    // public static void printNums(int n){
    //     for(int i = 0; i < n; i++){
    //         System.out.println(i);
    //     }
    // }

    // O(n+n) -> O(2n) remove constant so it's O(n)
    // public static void printNums(int n){
    //     for(int i = 0; i < n; i++){
    //         System.out.println(i);
    //     }
    //     for(int i = 0; i < n; i++){
    //         System.out.println(i);
    //     }
    // }

    // O(n*n) -> O(n*2)
    // public static void printNums(int n){
    //     for(int i = 0; i < n; i++){
    //         for(int j = 0; j < n; j++){
    //         System.out.println(i + " " + j);
    //         }
    //     }
    // }

    // O(n*2 + n) we drop non-dominant so it will be O(n*2)
    public static void printNums(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
            System.out.println(i + " " + j);
            }
        }
        for(int i = 0; i < n; i++){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        // printNums(10); // O(n) gave 9 numbers printed 9 
        // printNums(10); // O(n) gave 9 numbers printed same twice
        // printNums(10); // O(n*2) -> 9*9 
        printNums(10); // O(n*2 + n) -> ((9*9) + 9)
    }
}