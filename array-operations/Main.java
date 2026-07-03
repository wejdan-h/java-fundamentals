package sum;

public class Sum {
    public static void main(String[] args) {
        int[] A = {10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60};
        System.out.println(sum(A));
        System.out.println(prod(A));
    }
    
    public static int sum(int A[]){
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum = sum + A[i];
        }
        return sum;
    }
    
    public static int prod(int A[]){
        int ML = 1;
        for (int i = 0; i < A.length; i++) {
            ML = ML * A[i];
        }
        return ML;
    }
}
