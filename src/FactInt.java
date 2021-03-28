public class FactInt {
    public static void main(String[] args) {
        for (int n = 1; n < 10; n++)
            System.out.println(factorial(n));
    }
    //Calculates the factorial of integer n
    public static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return n*factorial(n-1);
    }
}