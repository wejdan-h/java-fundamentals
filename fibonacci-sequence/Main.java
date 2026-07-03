package newclass;

public class NewClass {
    public static int fib(int num) {
        if (num <= 1) {
            return num; 
        }
        else { 
            return fib(num-1) + fib(num-2); 
        }
    }

    public static void main(String[] args) {
        int fib_num = fib(7);
        System.out.println(fib_num); 
    }
}
